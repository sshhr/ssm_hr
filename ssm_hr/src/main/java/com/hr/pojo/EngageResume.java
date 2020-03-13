package com.hr.pojo;
import java.sql.Timestamp;

/**
 * ENGAGE_RESUME
 * 
 * @author sjh
 * @version 1.0.0 2020-03-10
 */
public class EngageResume implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8374004895820971422L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** ID */
    private Integer resId;

    /** 人名 */
    private String humanName;

    /** 招聘类型 */
    private String engageType;

    /** 地址 */
    private String humanAddress;

    /** 邮编 */
    private String humanPostcode;

    /** 职能ID */
    private String humanMajorKindId;

    /** 职能名称 */
    private String humanMajorKindName;

    /** 职位ID */
    private String humanMajorId;

    /** 职位名称 */
    private String humanMajorName;

    /** 电话 */
    private String humanTelephone;

    /** 固定电话 */
    private String humanHomephone;

    /** 手机 */
    private String humanMobilephone;

    /** 邮箱 */
    private String humanEmail;

    /** 爱好 */
    private String humanHobby;

    /** 特长 */
    private String humanSpecility;

    /** 性别 */
    private String humanSex;

    /** 宗教信仰 */
    private String humanReligion;

    /** 政治面貌 */
    private String humanParty;

    /** 国际 */
    private String humanNationality;

    /** 名族 */
    private String humanRace;

    /** 生日 */
    private Timestamp humanBirthday;

    /** 年龄 */
    private Integer humanAge;

    /** 学历 */
    private String humanEducatedDegree;

    /** 教育年限 */
    private Integer humanEducatedYears;

    /** 专业 */
    private String humanEducatedMajor;

    /** 大学 */
    private String humanCollege;

    /** 身份证 */
    private String humanIdcard;

    /** 出生地 */
    private String humanBirthplace;

    /** 期望薪资 */
    private Double demandSalaryStandard;

    /** 经验 */
    private String humanHistoryRecords;

    /** 个人履历 */
    private String remark;

    /** 推荐人 */
    private String recomandation;

    /** 照片 */
    private String humanPicture;

    /** 附件名 */
    private String attachmentName;

    /** 审核状态 */
    private Integer checkStatus;

    /** 登记者 */
    private String register;

    /** 登记时间 */
    private Timestamp registTime;

    /** 审核者 */
    private String checker;

    /** 审核时间 */
    private Timestamp checkTime;

    /** 面试状态 */
    private Integer interviewStatus;

    /** 总分 */
    private Double totalPoints;

    /** ？ */
    private Integer testAmount;

    /** ？ */
    private String testChecker;

    /** ？ */
    private Timestamp testCheckTime;

    /** ？ */
    private String passRegister;

    /** ？ */
    private Timestamp passRegistTime;

    /** ？ */
    private String passChecker;

    /** ？ */
    private Timestamp passCheckTime;

    /** ？ */
    private Integer passCheckStatus;

    /** ？ */
    private String passCheckcomment;

    /** ？ */
    private String passPasscomment;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取ID
     * 
     * @return ID
     */
    public Integer getResId() {
        return this.resId;
    }

    /**
     * 设置ID
     * 
     * @param resId
     *          ID
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

    /**
     * 获取人名
     * 
     * @return 人名
     */
    public String getHumanName() {
        return this.humanName;
    }

    /**
     * 设置人名
     * 
     * @param humanName
     *          人名
     */
    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    /**
     * 获取招聘类型
     * 
     * @return 招聘类型
     */
    public String getEngageType() {
        return this.engageType;
    }

    /**
     * 设置招聘类型
     * 
     * @param engageType
     *          招聘类型
     */
    public void setEngageType(String engageType) {
        this.engageType = engageType;
    }

    /**
     * 获取地址
     * 
     * @return 地址
     */
    public String getHumanAddress() {
        return this.humanAddress;
    }

    /**
     * 设置地址
     * 
     * @param humanAddress
     *          地址
     */
    public void setHumanAddress(String humanAddress) {
        this.humanAddress = humanAddress;
    }

    /**
     * 获取邮编
     * 
     * @return 邮编
     */
    public String getHumanPostcode() {
        return this.humanPostcode;
    }

    /**
     * 设置邮编
     * 
     * @param humanPostcode
     *          邮编
     */
    public void setHumanPostcode(String humanPostcode) {
        this.humanPostcode = humanPostcode;
    }

    /**
     * 获取职能ID
     * 
     * @return 职能ID
     */
    public String getHumanMajorKindId() {
        return this.humanMajorKindId;
    }

    /**
     * 设置职能ID
     * 
     * @param humanMajorKindId
     *          职能ID
     */
    public void setHumanMajorKindId(String humanMajorKindId) {
        this.humanMajorKindId = humanMajorKindId;
    }

    /**
     * 获取职能名称
     * 
     * @return 职能名称
     */
    public String getHumanMajorKindName() {
        return this.humanMajorKindName;
    }

    /**
     * 设置职能名称
     * 
     * @param humanMajorKindName
     *          职能名称
     */
    public void setHumanMajorKindName(String humanMajorKindName) {
        this.humanMajorKindName = humanMajorKindName;
    }

    /**
     * 获取职位ID
     * 
     * @return 职位ID
     */
    public String getHumanMajorId() {
        return this.humanMajorId;
    }

    /**
     * 设置职位ID
     * 
     * @param humanMajorId
     *          职位ID
     */
    public void setHumanMajorId(String humanMajorId) {
        this.humanMajorId = humanMajorId;
    }

    /**
     * 获取职位名称
     * 
     * @return 职位名称
     */
    public String getHumanMajorName() {
        return this.humanMajorName;
    }

    /**
     * 设置职位名称
     * 
     * @param humanMajorName
     *          职位名称
     */
    public void setHumanMajorName(String humanMajorName) {
        this.humanMajorName = humanMajorName;
    }

    /**
     * 获取电话
     * 
     * @return 电话
     */
    public String getHumanTelephone() {
        return this.humanTelephone;
    }

    /**
     * 设置电话
     * 
     * @param humanTelephone
     *          电话
     */
    public void setHumanTelephone(String humanTelephone) {
        this.humanTelephone = humanTelephone;
    }

    /**
     * 获取固定电话
     * 
     * @return 固定电话
     */
    public String getHumanHomephone() {
        return this.humanHomephone;
    }

    /**
     * 设置固定电话
     * 
     * @param humanHomephone
     *          固定电话
     */
    public void setHumanHomephone(String humanHomephone) {
        this.humanHomephone = humanHomephone;
    }

    /**
     * 获取手机
     * 
     * @return 手机
     */
    public String getHumanMobilephone() {
        return this.humanMobilephone;
    }

    /**
     * 设置手机
     * 
     * @param humanMobilephone
     *          手机
     */
    public void setHumanMobilephone(String humanMobilephone) {
        this.humanMobilephone = humanMobilephone;
    }

    /**
     * 获取邮箱
     * 
     * @return 邮箱
     */
    public String getHumanEmail() {
        return this.humanEmail;
    }

    /**
     * 设置邮箱
     * 
     * @param humanEmail
     *          邮箱
     */
    public void setHumanEmail(String humanEmail) {
        this.humanEmail = humanEmail;
    }

    /**
     * 获取爱好
     * 
     * @return 爱好
     */
    public String getHumanHobby() {
        return this.humanHobby;
    }

    /**
     * 设置爱好
     * 
     * @param humanHobby
     *          爱好
     */
    public void setHumanHobby(String humanHobby) {
        this.humanHobby = humanHobby;
    }

    /**
     * 获取特长
     * 
     * @return 特长
     */
    public String getHumanSpecility() {
        return this.humanSpecility;
    }

    /**
     * 设置特长
     * 
     * @param humanSpecility
     *          特长
     */
    public void setHumanSpecility(String humanSpecility) {
        this.humanSpecility = humanSpecility;
    }

    /**
     * 获取性别
     * 
     * @return 性别
     */
    public String getHumanSex() {
        return this.humanSex;
    }

    /**
     * 设置性别
     * 
     * @param humanSex
     *          性别
     */
    public void setHumanSex(String humanSex) {
        this.humanSex = humanSex;
    }

    /**
     * 获取宗教信仰
     * 
     * @return 宗教信仰
     */
    public String getHumanReligion() {
        return this.humanReligion;
    }

    /**
     * 设置宗教信仰
     * 
     * @param humanReligion
     *          宗教信仰
     */
    public void setHumanReligion(String humanReligion) {
        this.humanReligion = humanReligion;
    }

    /**
     * 获取政治面貌
     * 
     * @return 政治面貌
     */
    public String getHumanParty() {
        return this.humanParty;
    }

    /**
     * 设置政治面貌
     * 
     * @param humanParty
     *          政治面貌
     */
    public void setHumanParty(String humanParty) {
        this.humanParty = humanParty;
    }

    /**
     * 获取国际
     * 
     * @return 国际
     */
    public String getHumanNationality() {
        return this.humanNationality;
    }

    /**
     * 设置国际
     * 
     * @param humanNationality
     *          国际
     */
    public void setHumanNationality(String humanNationality) {
        this.humanNationality = humanNationality;
    }

    /**
     * 获取名族
     * 
     * @return 名族
     */
    public String getHumanRace() {
        return this.humanRace;
    }

    /**
     * 设置名族
     * 
     * @param humanRace
     *          名族
     */
    public void setHumanRace(String humanRace) {
        this.humanRace = humanRace;
    }

    /**
     * 获取生日
     * 
     * @return 生日
     */
    public Timestamp getHumanBirthday() {
        return this.humanBirthday;
    }

    /**
     * 设置生日
     * 
     * @param humanBirthday
     *          生日
     */
    public void setHumanBirthday(Timestamp humanBirthday) {
        this.humanBirthday = humanBirthday;
    }

    /**
     * 获取年龄
     * 
     * @return 年龄
     */
    public Integer getHumanAge() {
        return this.humanAge;
    }

    /**
     * 设置年龄
     * 
     * @param humanAge
     *          年龄
     */
    public void setHumanAge(Integer humanAge) {
        this.humanAge = humanAge;
    }

    /**
     * 获取学历
     * 
     * @return 学历
     */
    public String getHumanEducatedDegree() {
        return this.humanEducatedDegree;
    }

    /**
     * 设置学历
     * 
     * @param humanEducatedDegree
     *          学历
     */
    public void setHumanEducatedDegree(String humanEducatedDegree) {
        this.humanEducatedDegree = humanEducatedDegree;
    }

    /**
     * 获取教育年限
     * 
     * @return 教育年限
     */
    public Integer getHumanEducatedYears() {
        return this.humanEducatedYears;
    }

    /**
     * 设置教育年限
     * 
     * @param humanEducatedYears
     *          教育年限
     */
    public void setHumanEducatedYears(Integer humanEducatedYears) {
        this.humanEducatedYears = humanEducatedYears;
    }

    /**
     * 获取专业
     * 
     * @return 专业
     */
    public String getHumanEducatedMajor() {
        return this.humanEducatedMajor;
    }

    /**
     * 设置专业
     * 
     * @param humanEducatedMajor
     *          专业
     */
    public void setHumanEducatedMajor(String humanEducatedMajor) {
        this.humanEducatedMajor = humanEducatedMajor;
    }

    /**
     * 获取大学
     * 
     * @return 大学
     */
    public String getHumanCollege() {
        return this.humanCollege;
    }

    /**
     * 设置大学
     * 
     * @param humanCollege
     *          大学
     */
    public void setHumanCollege(String humanCollege) {
        this.humanCollege = humanCollege;
    }

    /**
     * 获取身份证
     * 
     * @return 身份证
     */
    public String getHumanIdcard() {
        return this.humanIdcard;
    }

    /**
     * 设置身份证
     * 
     * @param humanIdcard
     *          身份证
     */
    public void setHumanIdcard(String humanIdcard) {
        this.humanIdcard = humanIdcard;
    }

    /**
     * 获取出生地
     * 
     * @return 出生地
     */
    public String getHumanBirthplace() {
        return this.humanBirthplace;
    }

    /**
     * 设置出生地
     * 
     * @param humanBirthplace
     *          出生地
     */
    public void setHumanBirthplace(String humanBirthplace) {
        this.humanBirthplace = humanBirthplace;
    }

    /**
     * 获取期望薪资
     * 
     * @return 期望薪资
     */
    public Double getDemandSalaryStandard() {
        return this.demandSalaryStandard;
    }

    /**
     * 设置期望薪资
     * 
     * @param demandSalaryStandard
     *          期望薪资
     */
    public void setDemandSalaryStandard(Double demandSalaryStandard) {
        this.demandSalaryStandard = demandSalaryStandard;
    }

    /**
     * 获取经验
     * 
     * @return 经验
     */
    public String getHumanHistoryRecords() {
        return this.humanHistoryRecords;
    }

    /**
     * 设置经验
     * 
     * @param humanHistoryRecords
     *          经验
     */
    public void setHumanHistoryRecords(String humanHistoryRecords) {
        this.humanHistoryRecords = humanHistoryRecords;
    }

    /**
     * 获取个人履历
     * 
     * @return 个人履历
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置个人履历
     * 
     * @param remark
     *          个人履历
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取推荐人
     * 
     * @return 推荐人
     */
    public String getRecomandation() {
        return this.recomandation;
    }

    /**
     * 设置推荐人
     * 
     * @param recomandation
     *          推荐人
     */
    public void setRecomandation(String recomandation) {
        this.recomandation = recomandation;
    }

    /**
     * 获取照片
     * 
     * @return 照片
     */
    public String getHumanPicture() {
        return this.humanPicture;
    }

    /**
     * 设置照片
     * 
     * @param humanPicture
     *          照片
     */
    public void setHumanPicture(String humanPicture) {
        this.humanPicture = humanPicture;
    }

    /**
     * 获取附件名
     * 
     * @return 附件名
     */
    public String getAttachmentName() {
        return this.attachmentName;
    }

    /**
     * 设置附件名
     * 
     * @param attachmentName
     *          附件名
     */
    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    /**
     * 获取审核状态
     * 
     * @return 审核状态
     */
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    /**
     * 设置审核状态
     * 
     * @param checkStatus
     *          审核状态
     */
    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
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
     * 获取审核者
     * 
     * @return 审核者
     */
    public String getChecker() {
        return this.checker;
    }

    /**
     * 设置审核者
     * 
     * @param checker
     *          审核者
     */
    public void setChecker(String checker) {
        this.checker = checker;
    }

    /**
     * 获取审核时间
     * 
     * @return 审核时间
     */
    public Timestamp getCheckTime() {
        return this.checkTime;
    }

    /**
     * 设置审核时间
     * 
     * @param checkTime
     *          审核时间
     */
    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * 获取面试状态
     * 
     * @return 面试状态
     */
    public Integer getInterviewStatus() {
        return this.interviewStatus;
    }

    /**
     * 设置面试状态
     * 
     * @param interviewStatus
     *          面试状态
     */
    public void setInterviewStatus(Integer interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    /**
     * 获取总分
     * 
     * @return 总分
     */
    public Double getTotalPoints() {
        return this.totalPoints;
    }

    /**
     * 设置总分
     * 
     * @param totalPoints
     *          总分
     */
    public void setTotalPoints(Double totalPoints) {
        this.totalPoints = totalPoints;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public Integer getTestAmount() {
        return this.testAmount;
    }

    /**
     * 设置？
     * 
     * @param testAmount
     *          ？
     */
    public void setTestAmount(Integer testAmount) {
        this.testAmount = testAmount;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public String getTestChecker() {
        return this.testChecker;
    }

    /**
     * 设置？
     * 
     * @param testChecker
     *          ？
     */
    public void setTestChecker(String testChecker) {
        this.testChecker = testChecker;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public Timestamp getTestCheckTime() {
        return this.testCheckTime;
    }

    /**
     * 设置？
     * 
     * @param testCheckTime
     *          ？
     */
    public void setTestCheckTime(Timestamp testCheckTime) {
        this.testCheckTime = testCheckTime;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public String getPassRegister() {
        return this.passRegister;
    }

    /**
     * 设置？
     * 
     * @param passRegister
     *          ？
     */
    public void setPassRegister(String passRegister) {
        this.passRegister = passRegister;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public Timestamp getPassRegistTime() {
        return this.passRegistTime;
    }

    /**
     * 设置？
     * 
     * @param passRegistTime
     *          ？
     */
    public void setPassRegistTime(Timestamp passRegistTime) {
        this.passRegistTime = passRegistTime;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public String getPassChecker() {
        return this.passChecker;
    }

    /**
     * 设置？
     * 
     * @param passChecker
     *          ？
     */
    public void setPassChecker(String passChecker) {
        this.passChecker = passChecker;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public Timestamp getPassCheckTime() {
        return this.passCheckTime;
    }

    /**
     * 设置？
     * 
     * @param passCheckTime
     *          ？
     */
    public void setPassCheckTime(Timestamp passCheckTime) {
        this.passCheckTime = passCheckTime;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public Integer getPassCheckStatus() {
        return this.passCheckStatus;
    }

    /**
     * 设置？
     * 
     * @param passCheckStatus
     *          ？
     */
    public void setPassCheckStatus(Integer passCheckStatus) {
        this.passCheckStatus = passCheckStatus;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public String getPassCheckcomment() {
        return this.passCheckcomment;
    }

    /**
     * 设置？
     * 
     * @param passCheckcomment
     *          ？
     */
    public void setPassCheckcomment(String passCheckcomment) {
        this.passCheckcomment = passCheckcomment;
    }

    /**
     * 获取？
     * 
     * @return ？
     */
    public String getPassPasscomment() {
        return this.passPasscomment;
    }

    /**
     * 设置？
     * 
     * @param passPasscomment
     *          ？
     */
    public void setPassPasscomment(String passPasscomment) {
        this.passPasscomment = passPasscomment;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}