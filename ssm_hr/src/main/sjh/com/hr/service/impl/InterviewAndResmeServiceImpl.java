package com.hr.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageInterviewMapper;
import com.hr.mapper.EngageResumeMapper;
import com.hr.pojo.EngageInterview;
import com.hr.pojo.EngageResume;
import com.hr.service.InterviewAndResmeService;

@Service
public class InterviewAndResmeServiceImpl implements InterviewAndResmeService {
	@Autowired
	EngageResumeMapper engageResumeMapper;
	@Autowired
	EngageInterviewMapper engageInterviewMapper;
	@Override
	public Map<String, Object> findInterviewAndResme(String resumeId) {
		EngageInterview interview = engageInterviewMapper.findEngageInterviewByResumeId(resumeId);
		List<String> list = new ArrayList<>();
		list.add(resumeId);
		List<EngageResume> ll = engageResumeMapper.findEngageResumeByIds(list);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("interview", interview);
		map.put("resume", ll.get(0));
		return map;
	}

}
