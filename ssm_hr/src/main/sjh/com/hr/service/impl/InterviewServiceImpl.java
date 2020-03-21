package com.hr.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageInterviewMapper;
import com.hr.mapper.EngageResumeMapper;
import com.hr.pojo.EngageInterview;
import com.hr.pojo.EngageResume;
import com.hr.service.InterviewService;
import com.hr.util.ProjectToMapUtil;
import com.hr.util.ResumeState;

@Service
public class InterviewServiceImpl implements InterviewService {
	@Autowired
	EngageResumeMapper engageResumeMapper;
	@Autowired
	EngageInterviewMapper engageInterviewMapper;
	//登记
	@Override
	public boolean changeInterviewDengji(EngageResume engageResume, EngageInterview engageInterview) {
		engageResume.setInterviewStatus(2);
		Map<String,String> map = ProjectToMapUtil.toMap(engageResume);
		engageResumeMapper.updateEngageResume(map);
		engageInterview.setResumeId(engageResume.getResId());
		engageInterview.setInterviewStatus(2);
		EngageInterview interview = engageInterviewMapper.findEngageInterviewByResumeId(engageResume.getResId().toString());
		engageInterview.setEinId(interview.getEinId());
		Map<String,String> map1 = ProjectToMapUtil.toMap(engageInterview);
		engageInterviewMapper.updateEngageInterview(map1);
		return true;
	}

	//登记
	@Override
	public boolean changeInterviewShaixuan(String re,EngageResume engageResume, EngageInterview engageInterview) {
		switch (re) {
			case "建议面试":
				engageResume.setInterviewStatus(1);
				engageResume.setCheckStatus(ResumeState.RECOMMEND_INTERVIEW);
				Map<String,String> map = ProjectToMapUtil.toMap(engageResume);
				engageResumeMapper.updateEngageResume(map);
				engageInterview.setResumeId(engageResume.getResId());
				engageInterview.setInterviewStatus(1);
				engageInterview.setInterviewAmount(engageInterview.getInterviewAmount()+1);
				EngageInterview interview = engageInterviewMapper.findEngageInterviewByResumeId(engageResume.getResId().toString());
				engageInterview.setEinId(interview.getEinId());
				Map<String,String> map1 = ProjectToMapUtil.toMap(engageInterview);
				engageInterviewMapper.updateEngageInterview(map1);
				break;
			case "建议笔试":
				engageResume.setCheckStatus(ResumeState.RECOMMEND_TEST);
				Map<String,String> map2 = ProjectToMapUtil.toMap(engageResume);
				engageResumeMapper.updateEngageResume(map2);
				break;
			case "建议录用":
				engageResume.setCheckStatus(ResumeState.RECOMMEND_HIRING);
				Map<String,String> map3 = ProjectToMapUtil.toMap(engageResume);
				engageResumeMapper.updateEngageResume(map3);
				engageInterview.setResumeId(engageResume.getResId());
				engageInterview.setInterviewStatus(3);
				EngageInterview interview1 = engageInterviewMapper.findEngageInterviewByResumeId(engageResume.getResId().toString());
				engageInterview.setEinId(interview1.getEinId());
				Map<String,String> map5 = ProjectToMapUtil.toMap(engageInterview);
				engageInterviewMapper.updateEngageInterview(map5);
				break;
			case "删除简历":
				engageResume.setCheckStatus(ResumeState.RECOMMEND_REMOVE);
				Map<String,String> map4 = ProjectToMapUtil.toMap(engageResume);
				engageResumeMapper.updateEngageResume(map4);
				engageInterview.setResumeId(engageResume.getResId());
				engageInterview.setInterviewStatus(4);
				EngageInterview interview2 = engageInterviewMapper.findEngageInterviewByResumeId(engageResume.getResId().toString());
				engageInterview.setEinId(interview2.getEinId());
				Map<String,String> map6 = ProjectToMapUtil.toMap(engageInterview);
				engageInterviewMapper.updateEngageInterview(map6);
				break;
		}
		return true;
	}
}
