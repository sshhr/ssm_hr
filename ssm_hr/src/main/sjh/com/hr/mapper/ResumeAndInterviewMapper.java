package com.hr.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.dto.ResumeAndInterview;
import com.hr.dto.ResumeAndInterviewDetails;
import com.hr.pojo.EngageInterview;
@Repository
public interface ResumeAndInterviewMapper {
	public List<ResumeAndInterview> findResumeAndInterviewByCheckStatus(String checkStatus);
	public ResumeAndInterviewDetails findResumeAndInterviewByEinId(String einId);
	public ResumeAndInterviewDetails findResumeAndInterviewByresId(String resId);
}
