package com.hr.pojo;

/**
 * SALARY_STANDARD_DETAILS
 * 
 * @author sjh
 * @version 1.0.0 2020-03-10
 */
public class SalaryStandardDetails implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -6360379379123245091L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** sdtId */
    private Integer sdtId;

    /** standardId */
    private String standardId;

    /** standardName */
    private String standardName;

    /** itemId */
    private Integer itemId;

    /** itemName */
    private String itemName;

    /** salary */
    private Double salary;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取sdtId
     * 
     * @return sdtId
     */
    public Integer getSdtId() {
        return this.sdtId;
    }

    /**
     * 设置sdtId
     * 
     * @param sdtId
     */
    public void setSdtId(Integer sdtId) {
        this.sdtId = sdtId;
    }

    /**
     * 获取standardId
     * 
     * @return standardId
     */
    public String getStandardId() {
        return this.standardId;
    }

    /**
     * 设置standardId
     * 
     * @param standardId
     */
    public void setStandardId(String standardId) {
        this.standardId = standardId;
    }

    /**
     * 获取standardName
     * 
     * @return standardName
     */
    public String getStandardName() {
        return this.standardName;
    }

    /**
     * 设置standardName
     * 
     * @param standardName
     */
    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    /**
     * 获取itemId
     * 
     * @return itemId
     */
    public Integer getItemId() {
        return this.itemId;
    }

    /**
     * 设置itemId
     * 
     * @param itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取itemName
     * 
     * @return itemName
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * 设置itemName
     * 
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取salary
     * 
     * @return salary
     */
    public Double getSalary() {
        return this.salary;
    }

    /**
     * 设置salary
     * 
     * @param salary
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}