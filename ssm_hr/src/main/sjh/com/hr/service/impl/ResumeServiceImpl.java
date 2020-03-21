package com.hr.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageInterviewMapper;
import com.hr.mapper.EngageResumeMapper;
import com.hr.pojo.EngageInterview;
import com.hr.pojo.EngageResume;
import com.hr.service.ResumeService;
import com.hr.util.ProjectToMapUtil;

@Service
public class ResumeServiceImpl implements ResumeService {
	@Autowired
	EngageResumeMapper engageResumeMapper;
	@Autowired
	EngageInterviewMapper engageInterviewMapper;
	//推荐面试
	@Override
	public boolean updateResumeAndSaveEngageInterview(EngageResume engageResume, EngageInterview engageInterview) {
		Map<String,String> map = ProjectToMapUtil.toMap(engageResume);
		engageResumeMapper.updateEngageResume(map);
		EngageInterview ll = engageInterviewMapper.findEngageInterviewByResumeId(engageResume.getResId().toString());
		if(ll==null){
			engageInterview.setResumeId(engageResume.getResId());
			engageInterview.setInterviewAmount(1);
			engageInterviewMapper.insertEngageInterview(engageInterview);
		}
		return true;
	}

}
