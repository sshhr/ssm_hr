package com.hr.dto;

import java.io.Serializable;

public class ResumeAndInterview implements Serializable{
	 /**
	 * 
	 */
	 private static final long serialVersionUID = -3486173456073590860L;
	 private Integer einId;
	 private String humanName;
	 private String humanSex;
	 private Integer humanAge;
	 private String humanMajorKindName;
	 private String humanMajorName;
	 private String humanCollege;
	 private String humanEducatedMajor;
	 private String passCheckcomment;
	public Integer getEinId() {
		return einId;
	}
	public void setEinId(Integer einId) {
		this.einId = einId;
	}
	public String getHumanName() {
		return humanName;
	}
	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}
	public String getHumanSex() {
		return humanSex;
	}
	public void setHumanSex(String humanSex) {
		this.humanSex = humanSex;
	}
	public Integer getHumanAge() {
		return humanAge;
	}
	public void setHumanAge(Integer humanAge) {
		this.humanAge = humanAge;
	}
	public String getHumanMajorKindName() {
		return humanMajorKindName;
	}
	public void setHumanMajorKindName(String humanMajorKindName) {
		this.humanMajorKindName = humanMajorKindName;
	}
	public String getHumanMajorName() {
		return humanMajorName;
	}
	public void setHumanMajorName(String humanMajorName) {
		this.humanMajorName = humanMajorName;
	}
	public String getHumanCollege() {
		return humanCollege;
	}
	public void setHumanCollege(String humanCollege) {
		this.humanCollege = humanCollege;
	}
	public String getHumanEducatedMajor() {
		return humanEducatedMajor;
	}
	public void setHumanEducatedMajor(String humanEducatedMajor) {
		this.humanEducatedMajor = humanEducatedMajor;
	}
	public String getPassCheckcomment() {
		return passCheckcomment;
	}
	public void setPassCheckcomment(String passCheckcomment) {
		this.passCheckcomment = passCheckcomment;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ResumeAndInterview [einId=" + einId + ", humanName=" + humanName + ", humanSex=" + humanSex
				+ ", humanAge=" + humanAge + ", humanMajorKindName=" + humanMajorKindName + ", humanMajorName="
				+ humanMajorName + ", humanCollege=" + humanCollege + ", humanEducatedMajor=" + humanEducatedMajor
				+ ", passCheckcomment=" + passCheckcomment + "]";
	}
	 
}
