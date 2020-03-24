package com.hr.dto;

import java.sql.Timestamp;
import java.util.List;

import com.hr.pojo.EngageExamDetails;

public class EngageExamAndDetails implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8836000244338161962L;

	/** ID */
    private Integer exaId;

    /** 考试编号 */
    private String examNumber;

    /** 职能ID */
    private String majorKindId;

    /** 职能名称 */
    private String majorKindName;

    /** 职位ID */
    private String majorId;

    /** 职位名称 */
    private String majorName;

    /** 登记者 */
    private String register;

    /** 登记时间 */
    private String registTime;

    /** 限制时间 */
    private Integer limiteTime;
    
    private EngageExamDetails[] dList;

	public Integer getExaId() {
		return exaId;
	}

	public void setExaId(Integer exaId) {
		this.exaId = exaId;
	}

	public String getExamNumber() {
		return examNumber;
	}

	public void setExamNumber(String examNumber) {
		this.examNumber = examNumber;
	}

	public String getMajorKindId() {
		return majorKindId;
	}

	public void setMajorKindId(String majorKindId) {
		this.majorKindId = majorKindId;
	}

	public String getMajorKindName() {
		return majorKindName;
	}

	public void setMajorKindName(String majorKindName) {
		this.majorKindName = majorKindName;
	}

	public String getMajorId() {
		return majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}


	public String getRegistTime() {
		return registTime;
	}

	public void setRegistTime(String registTime) {
		this.registTime = registTime;
	}

	public Integer getLimiteTime() {
		return limiteTime;
	}

	public void setLimiteTime(Integer limiteTime) {
		this.limiteTime = limiteTime;
	}

	public EngageExamDetails[] getdList() {
		return dList;
	}

	public void setdList(EngageExamDetails[] dList) {
		this.dList = dList;
	}

	
}
