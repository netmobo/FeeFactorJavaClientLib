/*-
 * Copyright (c) 2010, NETMOBO LLC
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *     i.   Redistributions of source code must retain the above copyright 
 *          notice, this list of conditions and the following disclaimer.
 *     ii.  Redistributions in binary form must reproduce the above copyright 
 *          notice, this list of conditions and the following disclaimer in the 
 *          documentation and/or other materials provided with the 
 *          distribution.
 *     iii. Neither the name of NETMOBO LLC nor the names of its contributors 
 *          may be used to endorse or promote products derived from this 
 *          software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.feefactor.services;

/**
 * @author netmobo
 */
public class ChargeTypeOperation {

    protected boolean apply;
    protected String backUpFormula;
    protected long brandID;
    protected long brandServiceID;
    protected long chargeTypeOperationID;
    protected String chargeTypeOperationName;
    protected String condition;
    protected long conditionType;
    protected String description;
    protected String formula;
    protected long formulaType;
    protected boolean global;
    protected String schedule;
    protected long scheduleType;
    protected String variables;

    /**
     * Gets the value of the apply property.
     * 
     */
    public boolean isApply() {
        return apply;
    }

    /**
     * Sets the value of the apply property.
     * 
     */
    public void setApply(boolean value) {
        this.apply = value;
    }

    /**
     * Gets the value of the backUpFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackUpFormula() {
        return backUpFormula;
    }

    /**
     * Sets the value of the backUpFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackUpFormula(String value) {
        this.backUpFormula = value;
    }

    /**
     * Gets the value of the brandID property.
     * 
     */
    public long getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     */
    public void setBrandID(long value) {
        this.brandID = value;
    }

    /**
     * Gets the value of the brandServiceID property.
     * 
     */
    public long getBrandServiceID() {
        return brandServiceID;
    }

    /**
     * Sets the value of the brandServiceID property.
     * 
     */
    public void setBrandServiceID(long value) {
        this.brandServiceID = value;
    }

    /**
     * Gets the value of the chargeTypeOperationID property.
     * 
     */
    public long getChargeTypeOperationID() {
        return chargeTypeOperationID;
    }

    /**
     * Sets the value of the chargeTypeOperationID property.
     * 
     */
    public void setChargeTypeOperationID(long value) {
        this.chargeTypeOperationID = value;
    }

    /**
     * Gets the value of the chargeTypeOperationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeTypeOperationName() {
        return chargeTypeOperationName;
    }

    /**
     * Sets the value of the chargeTypeOperationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeTypeOperationName(String value) {
        this.chargeTypeOperationName = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the conditionType property.
     * 
     */
    public long getConditionType() {
        return conditionType;
    }

    /**
     * Sets the value of the conditionType property.
     * 
     */
    public void setConditionType(long value) {
        this.conditionType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the formulaType property.
     * 
     */
    public long getFormulaType() {
        return formulaType;
    }

    /**
     * Sets the value of the formulaType property.
     * 
     */
    public void setFormulaType(long value) {
        this.formulaType = value;
    }

    /**
     * Gets the value of the global property.
     * 
     */
    public boolean isGlobal() {
        return global;
    }

    /**
     * Sets the value of the global property.
     * 
     */
    public void setGlobal(boolean value) {
        this.global = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedule(String value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the scheduleType property.
     * 
     */
    public long getScheduleType() {
        return scheduleType;
    }

    /**
     * Sets the value of the scheduleType property.
     * 
     */
    public void setScheduleType(long value) {
        this.scheduleType = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariables(String value) {
        this.variables = value;
    }

}
