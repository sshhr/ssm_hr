package com.hr.service;


import com.hr.pojo.EngageInterview;
import com.hr.pojo.EngageResume;

public interface InterviewService {
	public boolean changeInterviewDengji(EngageResume engageResume,EngageInterview engageInterview);
	public boolean changeInterviewShaixuan(String re,EngageResume engageResume, EngageInterview engageInterview);
}
