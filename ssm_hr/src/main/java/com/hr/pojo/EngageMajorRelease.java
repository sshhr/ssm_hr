package com.hr.pojo;
import java.sql.Timestamp;

/**
 * ENGAGE_MAJOR_RELEASE
 * 
 * @author sjh
 * @version 1.0.0 2020-03-10
 */
public class EngageMajorRelease implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1173528826909242235L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** ID */
    private Integer mreId;

    /** 一级机构ID */
    private String firstKindId;

    /** 一级机构名称 */
    private String firstKindName;

    /** 二级机构ID */
    private String secondKindId;

    /** 二级机构名称 */
    private String secondKindName;

    /** 三级机构ID */
    private String thirdKindId;

    /** 三级机构名称 */
    private String thirdKindName;

    /** 职能ID */
    private String majorKindId;

    /** 职能名称 */
    private String majorKindName;

    /** 职位ID */
    private String majorId;

    /** 职位名称 */
    private String majorName;

    /** ？需要的人数 */
    private Integer humanAmount;

    /** engageType */
    private String engageType;

    /** deadline */
    private Timestamp deadline;

    /** 登记者 */
    private String register;

    /** 审核者 */
    private String changer;

    /** 登记时间 */
    private Timestamp registTime;

    /** 审核时间 */
    private Timestamp changeTime;

    /** majorDescribe */
    private String majorDescribe;

    /** engageRequired */
    private String engageRequired;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取ID
     * 
     * @return ID
     */
    public Integer getMreId() {
        return this.mreId;
    }

    /**
     * 设置ID
     * 
     * @param mreId
     *          ID
     */
    public void setMreId(Integer mreId) {
        this.mreId = mreId;
    }

    /**
     * 获取一级机构ID
     * 
     * @return 一级机构ID
     */
    public String getFirstKindId() {
        return this.firstKindId;
    }

    /**
     * 设置一级机构ID
     * 
     * @param firstKindId
     *          一级机构ID
     */
    public void setFirstKindId(String firstKindId) {
        this.firstKindId = firstKindId;
    }

    /**
     * 获取一级机构名称
     * 
     * @return 一级机构名称
     */
    public String getFirstKindName() {
        return this.firstKindName;
    }

    /**
     * 设置一级机构名称
     * 
     * @param firstKindName
     *          一级机构名称
     */
    public void setFirstKindName(String firstKindName) {
        this.firstKindName = firstKindName;
    }

    /**
     * 获取二级机构ID
     * 
     * @return 二级机构ID
     */
    public String getSecondKindId() {
        return this.secondKindId;
    }

    /**
     * 设置二级机构ID
     * 
     * @param secondKindId
     *          二级机构ID
     */
    public void setSecondKindId(String secondKindId) {
        this.secondKindId = secondKindId;
    }

    /**
     * 获取二级机构名称
     * 
     * @return 二级机构名称
     */
    public String getSecondKindName() {
        return this.secondKindName;
    }

    /**
     * 设置二级机构名称
     * 
     * @param secondKindName
     *          二级机构名称
     */
    public void setSecondKindName(String secondKindName) {
        this.secondKindName = secondKindName;
    }

    /**
     * 获取三级机构ID
     * 
     * @return 三级机构ID
     */
    public String getThirdKindId() {
        return this.thirdKindId;
    }

    /**
     * 设置三级机构ID
     * 
     * @param thirdKindId
     *          三级机构ID
     */
    public void setThirdKindId(String thirdKindId) {
        this.thirdKindId = thirdKindId;
    }

    /**
     * 获取三级机构名称
     * 
     * @return 三级机构名称
     */
    public String getThirdKindName() {
        return this.thirdKindName;
    }

    /**
     * 设置三级机构名称
     * 
     * @param thirdKindName
     *          三级机构名称
     */
    public void setThirdKindName(String thirdKindName) {
        this.thirdKindName = thirdKindName;
    }

    /**
     * 获取职能ID
     * 
     * @return 职能ID
     */
    public String getMajorKindId() {
        return this.majorKindId;
    }

    /**
     * 设置职能ID
     * 
     * @param majorKindId
     *          职能ID
     */
    public void setMajorKindId(String majorKindId) {
        this.majorKindId = majorKindId;
    }

    /**
     * 获取职能名称
     * 
     * @return 职能名称
     */
    public String getMajorKindName() {
        return this.majorKindName;
    }

    /**
     * 设置职能名称
     * 
     * @param majorKindName
     *          职能名称
     */
    public void setMajorKindName(String majorKindName) {
        this.majorKindName = majorKindName;
    }

    /**
     * 获取职位ID
     * 
     * @return 职位ID
     */
    public String getMajorId() {
        return this.majorId;
    }

    /**
     * 设置职位ID
     * 
     * @param majorId
     *          职位ID
     */
    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    /**
     * 获取职位名称
     * 
     * @return 职位名称
     */
    public String getMajorName() {
        return this.majorName;
    }

    /**
     * 设置职位名称
     * 
     * @param majorName
     *          职位名称
     */
    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    /**
     * 获取？需要的人数
     * 
     * @return ？需要的人数
     */
    public Integer getHumanAmount() {
        return this.humanAmount;
    }

    /**
     * 设置？需要的人数
     * 
     * @param humanAmount
     *          ？需要的人数
     */
    public void setHumanAmount(Integer humanAmount) {
        this.humanAmount = humanAmount;
    }

    /**
     * 获取engageType
     * 
     * @return engageType
     */
    public String getEngageType() {
        return this.engageType;
    }

    /**
     * 设置engageType
     * 
     * @param engageType
     */
    public void setEngageType(String engageType) {
        this.engageType = engageType;
    }

    /**
     * 获取deadline
     * 
     * @return deadline
     */
    public Timestamp getDeadline() {
        return this.deadline;
    }

    /**
     * 设置deadline
     * 
     * @param deadline
     */
    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    /**
     * 获取登记者
     * 
     * @return 登记者
     */
    public String getRegister() {
        return this.register;
    }

    /**
     * 设置登记者
     * 
     * @param register
     *          登记者
     */
    public void setRegister(String register) {
        this.register = register;
    }

    /**
     * 获取审核者
     * 
     * @return 审核者
     */
    public String getChanger() {
        return this.changer;
    }

    /**
     * 设置审核者
     * 
     * @param changer
     *          审核者
     */
    public void setChanger(String changer) {
        this.changer = changer;
    }

    /**
     * 获取登记时间
     * 
     * @return 登记时间
     */
    public Timestamp getRegistTime() {
        return this.registTime;
    }

    /**
     * 设置登记时间
     * 
     * @param registTime
     *          登记时间
     */
    public void setRegistTime(Timestamp registTime) {
        this.registTime = registTime;
    }

    /**
     * 获取审核时间
     * 
     * @return 审核时间
     */
    public Timestamp getChangeTime() {
        return this.changeTime;
    }

    /**
     * 设置审核时间
     * 
     * @param changeTime
     *          审核时间
     */
    public void setChangeTime(Timestamp changeTime) {
        this.changeTime = changeTime;
    }

    /**
     * 获取majorDescribe
     * 
     * @return majorDescribe
     */
    public String getMajorDescribe() {
        return this.majorDescribe;
    }

    /**
     * 设置majorDescribe
     * 
     * @param majorDescribe
     */
    public void setMajorDescribe(String majorDescribe) {
        this.majorDescribe = majorDescribe;
    }

    /**
     * 获取engageRequired
     * 
     * @return engageRequired
     */
    public String getEngageRequired() {
        return this.engageRequired;
    }

    /**
     * 设置engageRequired
     * 
     * @param engageRequired
     */
    public void setEngageRequired(String engageRequired) {
        this.engageRequired = engageRequired;
    }

	@Override
	public String toString() {
		return "EngageMajorRelease [mreId=" + mreId + ", firstKindId=" + firstKindId + ", firstKindName="
				+ firstKindName + ", secondKindId=" + secondKindId + ", secondKindName=" + secondKindName
				+ ", thirdKindId=" + thirdKindId + ", thirdKindName=" + thirdKindName + ", majorKindId=" + majorKindId
				+ ", majorKindName=" + majorKindName + ", majorId=" + majorId + ", majorName=" + majorName
				+ ", humanAmount=" + humanAmount + ", engageType=" + engageType + ", deadline=" + deadline
				+ ", register=" + register + ", changer=" + changer + ", registTime=" + registTime + ", changeTime="
				+ changeTime + ", majorDescribe=" + majorDescribe + ", engageRequired=" + engageRequired + "]";
	}

    
}