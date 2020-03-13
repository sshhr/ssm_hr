package com.hr.pojo;

/**
 * CONFIG_PRIMARY_KEY
 * 
 * @author sjh
 * @version 1.0.0 2020-03-10
 */
public class ConfigPrimaryKey implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -727418660109342161L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** id */
    private Integer prkId;

    /** 表id */
    private String primaryKeyTable;

    /** 主键 */
    private String primaryKey;

    /** 键名 */
    private String keyName;

    /** 状态 */
    private Integer primaryKeyStatus;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取id
     * 
     * @return id
     */
    public Integer getPrkId() {
        return this.prkId;
    }

    /**
     * 设置id
     * 
     * @param prkId
     *          id
     */
    public void setPrkId(Integer prkId) {
        this.prkId = prkId;
    }

    /**
     * 获取表id
     * 
     * @return 表id
     */
    public String getPrimaryKeyTable() {
        return this.primaryKeyTable;
    }

    /**
     * 设置表id
     * 
     * @param primaryKeyTable
     *          表id
     */
    public void setPrimaryKeyTable(String primaryKeyTable) {
        this.primaryKeyTable = primaryKeyTable;
    }

    /**
     * 获取主键
     * 
     * @return 主键
     */
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * 设置主键
     * 
     * @param primaryKey
     *          主键
     */
    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * 获取键名
     * 
     * @return 键名
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * 设置键名
     * 
     * @param keyName
     *          键名
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * 获取状态
     * 
     * @return 状态
     */
    public Integer getPrimaryKeyStatus() {
        return this.primaryKeyStatus;
    }

    /**
     * 设置状态
     * 
     * @param primaryKeyStatus
     *          状态
     */
    public void setPrimaryKeyStatus(Integer primaryKeyStatus) {
        this.primaryKeyStatus = primaryKeyStatus;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}