package com.hr.pojo;

/**
 * CONFIG_FILE_FIRST_KIND
 * 
 * @author sjh
 * @version 1.0.0 2020-03-10
 */
public class ConfigFileFirstKind implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3195568053559700466L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** id */
    private Integer ffkId;

    /** 第一类id */
    private String firstKindId;

    /** 第一类名称 */
    private String firstKindName;

    /** ？ */
    private String firstKindSalaryId;

    /** ？ */
    private String firstKindSaleId;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取id
     * 
     * @return id
     */
    public Integer getFfkId() {
        return this.ffkId;
    }

    /**
     * 设置id
     * 
     * @param ffkId
     *          id
     */
    public void setFfkId(Integer ffkId) {
        this.ffkId = ffkId;
    }

    /**
     * 获取第一类id
     * 
     * @return 第一类id
     */
    public String getFirstKindId() {
        return this.firstKindId;
    }

    /**
     * 设置第一类id
     * 
     * @param firstKindId
     *          第一类id
     */
    public void setFirstKindId(String firstKindId) {
        this.firstKindId = firstKindId;
    }

    /**
     * 获取第一类名称
     * 
     * @return 第一类名称
     */
    public String getFirstKindName() {
        return this.firstKindName;
    }

    /**
     * 设置第一类名称
     * 
     * @param firstKindName
     *          第一类名称
     */
    public void setFirstKindName(String firstKindName) {
        this.firstKindName = firstKindName;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public String getFirstKindSalaryId() {
        return this.firstKindSalaryId;
    }

    /**
     * 设置？
     * 
     * @param firstKindSalaryId
     *          ？
     */
    public void setFirstKindSalaryId(String firstKindSalaryId) {
        this.firstKindSalaryId = firstKindSalaryId;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public String getFirstKindSaleId() {
        return this.firstKindSaleId;
    }

    /**
     * 设置？
     * 
     * @param firstKindSaleId
     *          ？
     */
    public void setFirstKindSaleId(String firstKindSaleId) {
        this.firstKindSaleId = firstKindSaleId;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}