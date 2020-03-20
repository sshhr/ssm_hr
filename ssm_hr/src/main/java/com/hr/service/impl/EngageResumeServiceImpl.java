package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageResumeMapper;
import com.hr.pojo.EngageResume;
import com.hr.service.EngageResumeService;

@Service
public class EngageResumeServiceImpl implements EngageResumeService {
	@Autowired
	EngageResumeMapper EngageResumeMapper;

	@Override
	public List<EngageResume> findEngageResumeAll() {
		// TODO Auto-generated method stub
		return EngageResumeMapper.findEngageResumeAll();
	}

	@Override
	public List<EngageResume> findEngageResumeByIds(List list) {
		// TODO Auto-generated method stub
		return EngageResumeMapper.findEngageResumeByIds(list);
	}

	@Override
	public void saveEngageResume(EngageResume s) {
		EngageResumeMapper.insertEngageResume(s);
	}

	@Override
	public void changeEngageResume(Map map) {
		EngageResumeMapper.updateEngageResume(map);
	}

	@Override
	public void removeEngageResumeById(String id) {
		EngageResumeMapper.deleteEngageResumeById(id);
	}

	@Override
	public List<EngageResume> findchooseQuery(Map map) {
		return EngageResumeMapper.findchooseQuery(map);
	}

	@Override
	public List<EngageResume> findEngageResumeByCheckStatus(String checkStatus) {
		return EngageResumeMapper.findEngageResumeByCheckStatus(checkStatus);
	}
	
	

}
