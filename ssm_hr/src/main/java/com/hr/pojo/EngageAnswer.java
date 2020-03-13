package com.hr.pojo;

import java.sql.Timestamp;

/**
 * ENGAGE_ANSWER
 * 
 * @author sjh
 * @version 1.0.0 2020-03-10
 */
public class EngageAnswer implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -524142274330380385L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** 考试id */
    private Integer ansId;

    /** ？答题编号 */
    private String answerNumber;

    /** ？试卷编号 */
    private String examNumber;

    /** 简历ID */
    private Integer resumeId;

    /** ？面试ID */
    private Integer interviewId;

    /** 人名 */
    private String humanName;

    /** 身份证号 */
    private String humanIdcard;

    /** 职能分类id */
    private String majorKindId;

    /** 职能名 */
    private String majorKindName;

    /** 职位id */
    private String majorId;

    /** 职位名 */
    private String majorName;

    /** 考试时间 */
    private Timestamp testTime;

    /** 使用的时间 */
    private String useTime;

    /** ？总分 */
    private Double totalPoint;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取考试id
     * 
     * @return 考试id
     */
    public Integer getAnsId() {
        return this.ansId;
    }

    /**
     * 设置考试id
     * 
     * @param ansId
     *          考试id
     */
    public void setAnsId(Integer ansId) {
        this.ansId = ansId;
    }

    /**
     * 获取？答题编号
     * 
     * @return ？答题编号
     */
    public String getAnswerNumber() {
        return this.answerNumber;
    }

    /**
     * 设置？答题编号
     * 
     * @param answerNumber
     *          ？答题编号
     */
    public void setAnswerNumber(String answerNumber) {
        this.answerNumber = answerNumber;
    }

    /**
     * 获取？试卷编号
     * 
     * @return ？试卷编号
     */
    public String getExamNumber() {
        return this.examNumber;
    }

    /**
     * 设置？试卷编号
     * 
     * @param examNumber
     *          ？试卷编号
     */
    public void setExamNumber(String examNumber) {
        this.examNumber = examNumber;
    }

    /**
     * 获取简历ID
     * 
     * @return 简历ID
     */
    public Integer getResumeId() {
        return this.resumeId;
    }

    /**
     * 设置简历ID
     * 
     * @param resumeId
     *          简历ID
     */
    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * 获取？面试ID
     * 
     * @return ？面试ID
     */
    public Integer getInterviewId() {
        return this.interviewId;
    }

    /**
     * 设置？面试ID
     * 
     * @param interviewId
     *          ？面试ID
     */
    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
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
     * 获取身份证号
     * 
     * @return 身份证号
     */
    public String getHumanIdcard() {
        return this.humanIdcard;
    }

    /**
     * 设置身份证号
     * 
     * @param humanIdcard
     *          身份证号
     */
    public void setHumanIdcard(String humanIdcard) {
        this.humanIdcard = humanIdcard;
    }

    /**
     * 获取职能分类id
     * 
     * @return 职能分类id
     */
    public String getMajorKindId() {
        return this.majorKindId;
    }

    /**
     * 设置职能分类id
     * 
     * @param majorKindId
     *          职能分类id
     */
    public void setMajorKindId(String majorKindId) {
        this.majorKindId = majorKindId;
    }

    /**
     * 获取职能名
     * 
     * @return 职能名
     */
    public String getMajorKindName() {
        return this.majorKindName;
    }

    /**
     * 设置职能名
     * 
     * @param majorKindName
     *          职能名
     */
    public void setMajorKindName(String majorKindName) {
        this.majorKindName = majorKindName;
    }

    /**
     * 获取职位id
     * 
     * @return 职位id
     */
    public String getMajorId() {
        return this.majorId;
    }

    /**
     * 设置职位id
     * 
     * @param majorId
     *          职位id
     */
    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    /**
     * 获取职位名
     * 
     * @return 职位名
     */
    public String getMajorName() {
        return this.majorName;
    }

    /**
     * 设置职位名
     * 
     * @param majorName
     *          职位名
     */
    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    /**
     * 获取考试时间
     * 
     * @return 考试时间
     */
    public Timestamp getTestTime() {
        return this.testTime;
    }

    /**
     * 设置考试时间
     * 
     * @param testTime
     *          考试时间
     */
    public void setTestTime(Timestamp testTime) {
        this.testTime = testTime;
    }

    /**
     * 获取使用的时间
     * 
     * @return 使用的时间
     */
    public String getUseTime() {
        return this.useTime;
    }

    /**
     * 设置使用的时间
     * 
     * @param useTime
     *          使用的时间
     */
    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    /**
     * 获取？总分
     * 
     * @return ？总分
     */
    public Double getTotalPoint() {
        return this.totalPoint;
    }

    /**
     * 设置？总分
     * 
     * @param totalPoint
     *          ？总分
     */
    public void setTotalPoint(Double totalPoint) {
        this.totalPoint = totalPoint;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}