package com.hr.pojo;

/**
 * ENGAGE_ANSWER_DETAILS
 * 
 * @author sjh
 * @version 1.0.0 2020-03-10
 */
public class EngageAnswerDetails implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2219444420335737878L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** id */
    private Integer andId;

    /** ？答题编号 */
    private String answerNumber;

    /** ?科目id */
    private Integer subjectId;

    /** ？答案 */
    private String answer;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取id
     * 
     * @return id
     */
    public Integer getAndId() {
        return this.andId;
    }

    /**
     * 设置id
     * 
     * @param andId
     *          id
     */
    public void setAndId(Integer andId) {
        this.andId = andId;
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
     * 获取?科目id
     * 
     * @return ?科目id
     */
    public Integer getSubjectId() {
        return this.subjectId;
    }

    /**
     * 设置?科目id
     * 
     * @param subjectId
     *          ?科目id
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * 获取？答案
     * 
     * @return ？答案
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * 设置？答案
     * 
     * @param answer
     *          ？答案
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}