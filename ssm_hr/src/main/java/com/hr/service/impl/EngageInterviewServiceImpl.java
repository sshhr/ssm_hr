package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageInterviewMapper;
import com.hr.pojo.EngageInterview;
import com.hr.service.EngageInterviewService;

@Service
public class EngageInterviewServiceImpl implements EngageInterviewService {
	@Autowired
	EngageInterviewMapper EngageInterviewMapper;

	@Override
	public List<EngageInterview> findEngageInterviewAll() {
		// TODO Auto-generated method stub
		return EngageInterviewMapper.findEngageInterviewAll();
	}

	@Override
	public List<EngageInterview> findEngageInterviewByIds(List list) {
		// TODO Auto-generated method stub
		return EngageInterviewMapper.findEngageInterviewByIds(list);
	}
	
	@Override
	public List<EngageInterview> findEngageInterviewByInterviewStatus(String interviewStatus) {
		return EngageInterviewMapper.findEngageInterviewByInterviewStatus(interviewStatus);
	}

	@Override
	public void saveEngageInterview(EngageInterview s) {
		EngageInterviewMapper.insertEngageInterview(s);
	}

	@Override
	public void changeEngageInterview(Map map) {
		EngageInterviewMapper.updateEngageInterview(map);
	}

	@Override
	public void removeEngageInterviewById(String id) {
		EngageInterviewMapper.deleteEngageInterviewById(id);
	}

	@Override
	public EngageInterview findEngageInterviewByResumeId(String resumeId) {
		return EngageInterviewMapper.findEngageInterviewByResumeId(resumeId);
	}

	
	

}
