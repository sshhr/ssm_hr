package com.hr.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class EngageAnswerDetailAndEngageSubjects implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -333774237553818856L;

	/** id */
    private Integer andId;

    /** ？答题编号 */
    private String answerNumber;

    /** ?科目id */
    private Integer subjectId;

    /** ？答案 */
    private String answer;
    
    /** ID */
    private Integer subId;

    /** 一类题ID */
    private String firstKindId;

    /** 一类题名称 */
    private String firstKindName;

    /** 二类题ID */
    private String secondKindId;

    /** 二类题名称 */
    private String secondKindName;

    /** 登记者 */
    private String register;

    /** 登记时间 */
    private Timestamp registTime;

    /** 出处 */
    private String derivation;

    /** 题干 */
    private String content;

    /** a选项 */
    private String keyA;

    /** b选项 */
    private String keyB;

    /** c选项 */
    private String keyC;

    /** d选项 */
    private String keyD;

    /** e选项 */
    private String keyE;

    /** 正确答案 */
    private String correctKey;

    /** 修改人 */
    private String changer;

    /** 修改时间 */
    private Timestamp changeTime;

	public Integer getAndId() {
		return andId;
	}

	public void setAndId(Integer andId) {
		this.andId = andId;
	}

	public String getAnswerNumber() {
		return answerNumber;
	}

	public void setAnswerNumber(String answerNumber) {
		this.answerNumber = answerNumber;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Integer getSubId() {
		return subId;
	}

	public void setSubId(Integer subId) {
		this.subId = subId;
	}

	public String getFirstKindId() {
		return firstKindId;
	}

	public void setFirstKindId(String firstKindId) {
		this.firstKindId = firstKindId;
	}

	public String getFirstKindName() {
		return firstKindName;
	}

	public void setFirstKindName(String firstKindName) {
		this.firstKindName = firstKindName;
	}

	public String getSecondKindId() {
		return secondKindId;
	}

	public void setSecondKindId(String secondKindId) {
		this.secondKindId = secondKindId;
	}

	public String getSecondKindName() {
		return secondKindName;
	}

	public void setSecondKindName(String secondKindName) {
		this.secondKindName = secondKindName;
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

	public String getDerivation() {
		return derivation;
	}

	public void setDerivation(String derivation) {
		this.derivation = derivation;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getKeyA() {
		return keyA;
	}

	public void setKeyA(String keyA) {
		this.keyA = keyA;
	}

	public String getKeyB() {
		return keyB;
	}

	public void setKeyB(String keyB) {
		this.keyB = keyB;
	}

	public String getKeyC() {
		return keyC;
	}

	public void setKeyC(String keyC) {
		this.keyC = keyC;
	}

	public String getKeyD() {
		return keyD;
	}

	public void setKeyD(String keyD) {
		this.keyD = keyD;
	}

	public String getKeyE() {
		return keyE;
	}

	public void setKeyE(String keyE) {
		this.keyE = keyE;
	}

	public String getCorrectKey() {
		return correctKey;
	}

	public void setCorrectKey(String correctKey) {
		this.correctKey = correctKey;
	}

	public String getChanger() {
		return changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public Timestamp getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(Timestamp changeTime) {
		this.changeTime = changeTime;
	}
}
