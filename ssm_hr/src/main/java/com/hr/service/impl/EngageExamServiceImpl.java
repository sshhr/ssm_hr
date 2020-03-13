package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageExamMapper;
import com.hr.pojo.EngageExam;
import com.hr.service.EngageExamService;

@Service
public class EngageExamServiceImpl implements EngageExamService {
	@Autowired
	EngageExamMapper EngageExamMapper;

	@Override
	public List<EngageExam> findEngageExamAll() {
		// TODO Auto-generated method stub
		return EngageExamMapper.findEngageExamAll();
	}

	@Override
	public List<EngageExam> findEngageExamByIds(List list) {
		// TODO Auto-generated method stub
		return EngageExamMapper.findEngageExamByIds(list);
	}

	@Override
	public void saveEngageExam(EngageExam s) {
		EngageExamMapper.insertEngageExam(s);
	}

	@Override
	public void changeEngageExam(Map map) {
		EngageExamMapper.updateEngageExam(map);
	}

	@Override
	public void removeEngageExamById(String id) {
		EngageExamMapper.deleteEngageExamById(id);
	}
	
	

}
