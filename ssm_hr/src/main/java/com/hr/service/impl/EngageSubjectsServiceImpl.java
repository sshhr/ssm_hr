package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.dto.EngageSubjectsAndAmount;
import com.hr.mapper.EngageSubjectsMapper;
import com.hr.pojo.EngageSubjects;
import com.hr.service.EngageSubjectsService;

@Service
public class EngageSubjectsServiceImpl implements EngageSubjectsService {
	@Autowired
	EngageSubjectsMapper EngageSubjectsMapper;

	@Override
	public List<EngageSubjects> findEngageSubjectsAll() {
		// TODO Auto-generated method stub
		return EngageSubjectsMapper.findEngageSubjectsAll();
	}

	@Override
	public List<EngageSubjects> findEngageSubjectsByIds(List list) {
		// TODO Auto-generated method stub
		return EngageSubjectsMapper.findEngageSubjectsByIds(list);
	}

	@Override
	public void saveEngageSubjects(EngageSubjects s) {
		EngageSubjectsMapper.insertEngageSubjects(s);
	}

	@Override
	public void changeEngageSubjects(Map map) {
		EngageSubjectsMapper.updateEngageSubjects(map);
	}

	@Override
	public void removeEngageSubjectsById(String id) {
		EngageSubjectsMapper.deleteEngageSubjectsById(id);
	}

	@Override
	public List<EngageSubjects> findchooseQuery(Map map) {
		return EngageSubjectsMapper.findchooseQuery(map);
	}

	@Override
	public List<EngageSubjectsAndAmount> findEngageSubjectsAndAmount() {
		return EngageSubjectsMapper.findEngageSubjectsAndAmount();
	}

	@Override
	public List<EngageSubjects> findEngageSubjectsBysuiji(Map map) {
		// TODO Auto-generated method stub
		return EngageSubjectsMapper.findEngageSubjectsBysuiji(map);
	}
	
	

}
