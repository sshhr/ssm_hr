package com.hr.service;

import java.util.List;

import com.hr.dto.ResumeAndInterview;
import com.hr.dto.ResumeAndInterviewDetails;
import com.hr.pojo.EngageInterview;

public interface ResumeAndInterviewService {
	public List<ResumeAndInterview> findResumeAndInterviewByCheckStatus(String checkStatus);
	public ResumeAndInterviewDetails findResumeAndInterviewByEinId(String einId);
	public ResumeAndInterviewDetails findResumeAndInterviewByresId(String resId);
}
