package com.utility;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.n3.nanoxml.IXMLElement;
import net.n3.nanoxml.IXMLParser;
import net.n3.nanoxml.IXMLReader;
import net.n3.nanoxml.StdXMLReader;
import net.n3.nanoxml.XMLParserFactory;
import net.n3.nanoxml.XMLWriter;

import org.apache.axiom.om.util.Base64;

/**
 * @author netmobo
 */
public class XMLUtility {
    private static Logger logger = Logger.getLogger(XMLUtility.class.toString());
    private static Map<Class<?>, Map<Field, Matcher>> registered = new HashMap<Class<?>, Map<Field,Matcher>>();
    private static Map<Class<?>, Map<Field, Map<String, Method>>> methods = new HashMap<Class<?>, Map<Field, Map<String,Method>>>();
    
    private static NumberFormat nf = NumberFormat.getInstance();
    static {
        nf.setMaximumIntegerDigits(2);
        nf.setMinimumIntegerDigits(2);
        nf.setMaximumFractionDigits(0);
    }
    
    private static Matcher basic;
    static{
        try {
            Pattern p = Pattern.compile("<[^>]*>([^<]*)</[^>]*>");
            basic = p.matcher("");
        } catch (Exception e){
        }
    }
    
    public static void registerClass(Class<?> clazz){
        Map<Field, Matcher> result = new HashMap<Field, Matcher>();
        Map<Field, Map<String, Method>> mmap = new HashMap<Field, Map<String, Method>>();
        for(Field field : clazz.getDeclaredFields()){
            Map<String, Method> pair = new HashMap<String, Method>();
            try {
                String fieldName = field.getName();
                fieldName = (fieldName.charAt(0)+"").toUpperCase() + fieldName.substring(1);
                Method meth = null;
                try {
                    meth = clazz.getDeclaredMethod("get"+fieldName);
                } catch (Exception e){
                }
                
                if(meth==null){
                    meth = clazz.getDeclaredMethod("is"+fieldName);
                }
                if(meth==null){
                    continue;
                }
                pair.put("GET", meth);
                meth = clazz.getDeclaredMethod("set"+fieldName, meth.getReturnType());
                if(meth!=null){
                    pair.put("SET", meth);
                }
            } catch (Exception e1) {
                continue;
            }
            try {
                Pattern p = Pattern.compile("<"+field.getName()+"[^>]*>([^<]*)</"+field.getName()+">", Pattern.CASE_INSENSITIVE);
                Matcher m = p.matcher("");
                result.put(field, m);
            } catch (Exception e){
            }
            mmap.put(field, pair);
        }
        registered.put(clazz, result);
        methods.put(clazz, mmap);
    }
    
    public static String toXML(Object o, String tagName, String namespace){
        Map<Field, Matcher> registry = registered.get(o.getClass());
        if(registry==null){
            registerClass(o.getClass());
        }
        registry = registered.get(o.getClass());
        
        StringBuffer sb = new StringBuffer();
        sb.append("<").append(tagName);
        if(namespace!=null && namespace.trim().length()>0){
            sb.append(" xmlns=\"").append(namespace).append("\"");
        }
        sb.append(">");
        for(Field field : registry.keySet()){
            sb.append("<").append(field.getName()).append(">");
            try {
                Method m = methods.get(o.getClass()).get(field).get("GET");
                Object value = m.invoke(o);
                if(value!=null){
                    if(value instanceof Calendar){
                        Calendar holder = (Calendar)value;
                        //yyyy-MM-dd'T'HH:mm:ss.SS
                        sb.append(holder.get(Calendar.YEAR)).append("-");
                        sb.append(nf.format(holder.get(Calendar.MONTH)+1)).append("-");
                        sb.append(nf.format(holder.get(Calendar.DAY_OF_MONTH))).append("T");
                        sb.append(nf.format(holder.get(Calendar.HOUR_OF_DAY))).append(":");
                        sb.append(nf.format(holder.get(Calendar.MINUTE))).append(":");
                        sb.append(nf.format(holder.get(Calendar.SECOND))).append("Z");
                    } else if(value.getClass().equals(byte[].class)){
                        sb.append(Base64.encode((byte[])value));
                    } else {
                        sb.append(value.toString().trim());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            sb.append("</").append(field.getName()).append(">");
        }
        sb.append("</").append(tagName).append(">");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    public static <T> T fromXML(Class<T> c, String xml){
        logger.fine("fromXML received: " + xml);
        
        IXMLElement xmlRep = null;
        IXMLParser parser = null;
        try {
            IXMLReader reader = StdXMLReader.stringReader(xml);
            parser = XMLParserFactory.createDefaultXMLParser();
            parser.setReader(reader);
            xmlRep = (IXMLElement) parser.parse();
        } catch (Exception e){
            logger.severe("Unable to convert response to xml. " + e.getMessage());
        }
        
        if(c.equals(String.class)){
            return (T)xmlRep.getContent(); 
        }
        
        Map<Field, Matcher> registry = registered.get(c);
        if(registry==null){
            registerClass(c);
        }
        registry = registered.get(c);

        T result = null;
        try {
            result = c.newInstance();
        } catch (Exception e1) {
            logger.severe("Unable to instantiate class using default constructor. " + e1.getMessage());
            return null;
        }
        
        for(IXMLElement child : (Vector<IXMLElement>)xmlRep.getChildren()){
            Field f = null;
            try {
                f = c.getDeclaredField(child.getName());
                //TODO: how to better convert string to expected primitive type...
                
                Method getter = methods.get(c).get(f).get("GET");
                Class<?> paramClass = getter.getReturnType();
                Method setter = methods.get(c).get(f).get("SET");
                
                if(paramClass.equals(long.class)){
                    setter.invoke(result, Long.parseLong(child.getContent()));
                }else if(paramClass.equals(int.class)){
                    setter.invoke(result, Integer.parseInt(child.getContent()));
                }else if(paramClass.equals(double.class)){
                    setter.invoke(result, Double.parseDouble(child.getContent()));
                }else if(paramClass.equals(float.class)){
                    setter.invoke(result, Float.parseFloat(child.getContent()));
                }else if(paramClass.equals(boolean.class)){
                    setter.invoke(result, Boolean.parseBoolean(child.getContent()));
                }else if(paramClass.equals(byte[].class)){
                    setter.invoke(result, Base64.decode(child.getContent()));
                }else if(paramClass.equals(String.class)){
                    setter.invoke(result, child.getContent());
                }else if(paramClass.equals(Calendar.class)){
                    Calendar cal = Calendar.getInstance();
                    String[] parts = child.getContent().split("[^0-9]");
                    //new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SS")
                    cal.set(Calendar.YEAR, new Integer(parts[0]));
                    cal.set(Calendar.MONTH, new Integer(parts[1])-1);
                    cal.set(Calendar.DAY_OF_MONTH, new Integer(parts[2]));
                    cal.set(Calendar.HOUR_OF_DAY, new Integer(parts[3]));
                    cal.set(Calendar.MINUTE, new Integer(parts[4]));
                    cal.set(Calendar.SECOND, new Integer(parts[5]));
                    try {
                        cal.set(Calendar.MILLISECOND, new Integer(parts[6]));
                    } catch(Exception e){
                    }
                    cal.getTimeInMillis();
                    setter.invoke(result, cal);
                }
            } catch (Exception e) {
                logger.warning("Unable to set " + child.getName()+". " + e.getMessage());
            }
        }

        return result;
    }
    
    public static String basicFromXML(String xml){
        logger.fine("basicFromXML received: " + xml);
        basic.reset(xml);
        if(basic.find()){
            return basic.group(1);
        }
        return "";
    }
    
    @SuppressWarnings("unchecked")
    public static <U, T extends List<U>> T listFromXML(Class<U> c, String xml){
        logger.fine("listFromXML received: " + xml);
        
        T l = (T)new ArrayList<U>();
        IXMLElement xmlRep = null;
        IXMLParser parser = null;
        try {
            IXMLReader reader = StdXMLReader.stringReader(xml);
            parser = XMLParserFactory.createDefaultXMLParser();
            parser.setReader(reader);
            xmlRep = (IXMLElement) parser.parse();
        } catch (Exception e){
            logger.severe("Unable to convert response to xml. " + e.getMessage()+", xml: " + xml);
            e.printStackTrace();
        }
        
        if(xmlRep==null || xmlRep.getChildren()==null || xmlRep.getChildren().size()<1){
            return l;
        }
        
        StringWriter sw = new StringWriter();
        XMLWriter writer = new XMLWriter(sw);
        for(IXMLElement child : (Vector<IXMLElement>)xmlRep.getChildren()){
            sw.getBuffer().setLength(0);
            try {
                writer.write(child);
                l.add(fromXML(c, sw.getBuffer().toString()));
            } catch (IOException e) {
                logger.severe("Unable to properly convert individual record. " + e.getMessage());
            }
            sw.getBuffer().setLength(0);
        }
        
        return l;
    }
}
