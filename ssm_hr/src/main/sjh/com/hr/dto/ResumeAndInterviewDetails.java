package com.hr.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class ResumeAndInterviewDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7761624777597275957L;
	
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
    private String humanBirthday;

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

    /** 个人履历 */
    private String humanHistoryRecords;

    /** 备注 */
    private String remark;

    /** 推荐意见 */
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
    
    
    
    /** ID */
    private Integer einId;

    /** 面试的次数 */
    private Integer interviewAmount;

    /** 形象等级 */
    private String imageDegree;

    /** 普通话等级 */
    private String nativeLanguageDegree;

    /** 外语等级 */
    private String foreignLanguageDegree;

    /** 应变能力等级 */
    private String responseSpeedDegree;

    /** EQ等级 */
    private String eqDegree;

    /** IQ等级 */
    private String iqDegree;

    /** 总体等级 */
    private String multiQualityDegree;

    /** 登记者 */
    private String iregister;

    /** 审核者 */
    private String ichecker;

    /** 登记时间 */
    private Timestamp registeTime;

    /** 审核时间 */
    private Timestamp icheckTime;

    /** 简历ID */
    private Integer resumeId;

    /** 结果 */
    private String result;

    /** 面试评价 */
    private String interviewComment;

    /** 审核者评价 */
    private String checkComment;

    /** 面试状态 */
    private Integer iinterviewStatus;

    /** 审核状态 */
    private Integer icheckStatus;

	public Integer getResId() {
		return resId;
	}

	public void setResId(Integer resId) {
		this.resId = resId;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getEngageType() {
		return engageType;
	}

	public void setEngageType(String engageType) {
		this.engageType = engageType;
	}

	public String getHumanAddress() {
		return humanAddress;
	}

	public void setHumanAddress(String humanAddress) {
		this.humanAddress = humanAddress;
	}

	public String getHumanPostcode() {
		return humanPostcode;
	}

	public void setHumanPostcode(String humanPostcode) {
		this.humanPostcode = humanPostcode;
	}

	public String getHumanMajorKindId() {
		return humanMajorKindId;
	}

	public void setHumanMajorKindId(String humanMajorKindId) {
		this.humanMajorKindId = humanMajorKindId;
	}

	public String getHumanMajorKindName() {
		return humanMajorKindName;
	}

	public void setHumanMajorKindName(String humanMajorKindName) {
		this.humanMajorKindName = humanMajorKindName;
	}

	public String getHumanMajorId() {
		return humanMajorId;
	}

	public void setHumanMajorId(String humanMajorId) {
		this.humanMajorId = humanMajorId;
	}

	public String getHumanMajorName() {
		return humanMajorName;
	}

	public void setHumanMajorName(String humanMajorName) {
		this.humanMajorName = humanMajorName;
	}

	public String getHumanTelephone() {
		return humanTelephone;
	}

	public void setHumanTelephone(String humanTelephone) {
		this.humanTelephone = humanTelephone;
	}

	public String getHumanHomephone() {
		return humanHomephone;
	}

	public void setHumanHomephone(String humanHomephone) {
		this.humanHomephone = humanHomephone;
	}

	public String getHumanMobilephone() {
		return humanMobilephone;
	}

	public void setHumanMobilephone(String humanMobilephone) {
		this.humanMobilephone = humanMobilephone;
	}

	public String getHumanEmail() {
		return humanEmail;
	}

	public void setHumanEmail(String humanEmail) {
		this.humanEmail = humanEmail;
	}

	public String getHumanHobby() {
		return humanHobby;
	}

	public void setHumanHobby(String humanHobby) {
		this.humanHobby = humanHobby;
	}

	public String getHumanSpecility() {
		return humanSpecility;
	}

	public void setHumanSpecility(String humanSpecility) {
		this.humanSpecility = humanSpecility;
	}

	public String getHumanSex() {
		return humanSex;
	}

	public void setHumanSex(String humanSex) {
		this.humanSex = humanSex;
	}

	public String getHumanReligion() {
		return humanReligion;
	}

	public void setHumanReligion(String humanReligion) {
		this.humanReligion = humanReligion;
	}

	public String getHumanParty() {
		return humanParty;
	}

	public void setHumanParty(String humanParty) {
		this.humanParty = humanParty;
	}

	public String getHumanNationality() {
		return humanNationality;
	}

	public void setHumanNationality(String humanNationality) {
		this.humanNationality = humanNationality;
	}

	public String getHumanRace() {
		return humanRace;
	}

	public void setHumanRace(String humanRace) {
		this.humanRace = humanRace;
	}

	public String getHumanBirthday() {
		return humanBirthday;
	}

	public void setHumanBirthday(String humanBirthday) {
		this.humanBirthday = humanBirthday;
	}

	public Integer getHumanAge() {
		return humanAge;
	}

	public void setHumanAge(Integer humanAge) {
		this.humanAge = humanAge;
	}

	public String getHumanEducatedDegree() {
		return humanEducatedDegree;
	}

	public void setHumanEducatedDegree(String humanEducatedDegree) {
		this.humanEducatedDegree = humanEducatedDegree;
	}

	public Integer getHumanEducatedYears() {
		return humanEducatedYears;
	}

	public void setHumanEducatedYears(Integer humanEducatedYears) {
		this.humanEducatedYears = humanEducatedYears;
	}

	public String getHumanEducatedMajor() {
		return humanEducatedMajor;
	}

	public void setHumanEducatedMajor(String humanEducatedMajor) {
		this.humanEducatedMajor = humanEducatedMajor;
	}

	public String getHumanCollege() {
		return humanCollege;
	}

	public void setHumanCollege(String humanCollege) {
		this.humanCollege = humanCollege;
	}

	public String getHumanIdcard() {
		return humanIdcard;
	}

	public void setHumanIdcard(String humanIdcard) {
		this.humanIdcard = humanIdcard;
	}

	public String getHumanBirthplace() {
		return humanBirthplace;
	}

	public void setHumanBirthplace(String humanBirthplace) {
		this.humanBirthplace = humanBirthplace;
	}

	public Double getDemandSalaryStandard() {
		return demandSalaryStandard;
	}

	public void setDemandSalaryStandard(Double demandSalaryStandard) {
		this.demandSalaryStandard = demandSalaryStandard;
	}

	public String getHumanHistoryRecords() {
		return humanHistoryRecords;
	}

	public void setHumanHistoryRecords(String humanHistoryRecords) {
		this.humanHistoryRecords = humanHistoryRecords;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRecomandation() {
		return recomandation;
	}

	public void setRecomandation(String recomandation) {
		this.recomandation = recomandation;
	}

	public String getHumanPicture() {
		return humanPicture;
	}

	public void setHumanPicture(String humanPicture) {
		this.humanPicture = humanPicture;
	}

	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public Integer getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public Timestamp getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Timestamp getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public Integer getInterviewStatus() {
		return interviewStatus;
	}

	public void setInterviewStatus(Integer interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	public Double getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(Double totalPoints) {
		this.totalPoints = totalPoints;
	}

	public Integer getTestAmount() {
		return testAmount;
	}

	public void setTestAmount(Integer testAmount) {
		this.testAmount = testAmount;
	}

	public String getTestChecker() {
		return testChecker;
	}

	public void setTestChecker(String testChecker) {
		this.testChecker = testChecker;
	}

	public Timestamp getTestCheckTime() {
		return testCheckTime;
	}

	public void setTestCheckTime(Timestamp testCheckTime) {
		this.testCheckTime = testCheckTime;
	}

	public String getPassRegister() {
		return passRegister;
	}

	public void setPassRegister(String passRegister) {
		this.passRegister = passRegister;
	}

	public Timestamp getPassRegistTime() {
		return passRegistTime;
	}

	public void setPassRegistTime(Timestamp passRegistTime) {
		this.passRegistTime = passRegistTime;
	}

	public String getPassChecker() {
		return passChecker;
	}

	public void setPassChecker(String passChecker) {
		this.passChecker = passChecker;
	}

	public Timestamp getPassCheckTime() {
		return passCheckTime;
	}

	public void setPassCheckTime(Timestamp passCheckTime) {
		this.passCheckTime = passCheckTime;
	}

	public Integer getPassCheckStatus() {
		return passCheckStatus;
	}

	public void setPassCheckStatus(Integer passCheckStatus) {
		this.passCheckStatus = passCheckStatus;
	}

	public String getPassCheckcomment() {
		return passCheckcomment;
	}

	public void setPassCheckcomment(String passCheckcomment) {
		this.passCheckcomment = passCheckcomment;
	}

	public String getPassPasscomment() {
		return passPasscomment;
	}

	public void setPassPasscomment(String passPasscomment) {
		this.passPasscomment = passPasscomment;
	}

	public Integer getEinId() {
		return einId;
	}

	public void setEinId(Integer einId) {
		this.einId = einId;
	}

	public Integer getInterviewAmount() {
		return interviewAmount;
	}

	public void setInterviewAmount(Integer interviewAmount) {
		this.interviewAmount = interviewAmount;
	}

	public String getImageDegree() {
		return imageDegree;
	}

	public void setImageDegree(String imageDegree) {
		this.imageDegree = imageDegree;
	}

	public String getNativeLanguageDegree() {
		return nativeLanguageDegree;
	}

	public void setNativeLanguageDegree(String nativeLanguageDegree) {
		this.nativeLanguageDegree = nativeLanguageDegree;
	}

	public String getForeignLanguageDegree() {
		return foreignLanguageDegree;
	}

	public void setForeignLanguageDegree(String foreignLanguageDegree) {
		this.foreignLanguageDegree = foreignLanguageDegree;
	}

	public String getResponseSpeedDegree() {
		return responseSpeedDegree;
	}

	public void setResponseSpeedDegree(String responseSpeedDegree) {
		this.responseSpeedDegree = responseSpeedDegree;
	}

	public String getEqDegree() {
		return eqDegree;
	}

	public void setEqDegree(String eqDegree) {
		this.eqDegree = eqDegree;
	}

	public String getIqDegree() {
		return iqDegree;
	}

	public void setIqDegree(String iqDegree) {
		this.iqDegree = iqDegree;
	}

	public String getMultiQualityDegree() {
		return multiQualityDegree;
	}

	public void setMultiQualityDegree(String multiQualityDegree) {
		this.multiQualityDegree = multiQualityDegree;
	}

	public String getIregister() {
		return iregister;
	}

	public void setIregister(String iregister) {
		this.iregister = iregister;
	}

	public String getIchecker() {
		return ichecker;
	}

	public void setIchecker(String ichecker) {
		this.ichecker = ichecker;
	}

	public Timestamp getRegisteTime() {
		return registeTime;
	}

	public void setRegisteTime(Timestamp registeTime) {
		this.registeTime = registeTime;
	}

	public Timestamp getIcheckTime() {
		return icheckTime;
	}

	public void setIcheckTime(Timestamp icheckTime) {
		this.icheckTime = icheckTime;
	}

	public Integer getResumeId() {
		return resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getInterviewComment() {
		return interviewComment;
	}

	public void setInterviewComment(String interviewComment) {
		this.interviewComment = interviewComment;
	}

	public String getCheckComment() {
		return checkComment;
	}

	public void setCheckComment(String checkComment) {
		this.checkComment = checkComment;
	}

	public Integer getIinterviewStatus() {
		return iinterviewStatus;
	}

	public void setIinterviewStatus(Integer iinterviewStatus) {
		this.iinterviewStatus = iinterviewStatus;
	}

	public Integer getIcheckStatus() {
		return icheckStatus;
	}

	public void setIcheckStatus(Integer icheckStatus) {
		this.icheckStatus = icheckStatus;
	}
    
    
}
