package com.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.dto.ResumeAndInterview;
import com.hr.dto.ResumeAndInterviewDetails;
import com.hr.mapper.ResumeAndInterviewMapper;
import com.hr.pojo.EngageInterview;
import com.hr.service.ResumeAndInterviewService;

@Service
public class ResumeAndInterviewServiceImpl implements ResumeAndInterviewService {
	@Autowired
	ResumeAndInterviewMapper resumeAndInterviewMapper;
	@Override
	public List<ResumeAndInterview> findResumeAndInterviewByCheckStatus(String checkStatus) {
		return resumeAndInterviewMapper.findResumeAndInterviewByCheckStatus(checkStatus);
	}
	@Override
	public ResumeAndInterviewDetails findResumeAndInterviewByEinId(String einId) {
		return resumeAndInterviewMapper.findResumeAndInterviewByEinId(einId);
	}
	@Override
	public ResumeAndInterviewDetails findResumeAndInterviewByresId(String resId) {
		return resumeAndInterviewMapper.findResumeAndInterviewByresId(resId);
	}

}
