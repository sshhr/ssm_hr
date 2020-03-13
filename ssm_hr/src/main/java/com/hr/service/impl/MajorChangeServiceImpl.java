package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.MajorChangeMapper;
import com.hr.pojo.MajorChange;
import com.hr.service.MajorChangeService;

@Service
public class MajorChangeServiceImpl implements MajorChangeService {
	@Autowired
	MajorChangeMapper MajorChangeMapper;

	@Override
	public List<MajorChange> findMajorChangeAll() {
		// TODO Auto-generated method stub
		return MajorChangeMapper.findMajorChangeAll();
	}

	@Override
	public List<MajorChange> findMajorChangeByIds(List list) {
		// TODO Auto-generated method stub
		return MajorChangeMapper.findMajorChangeByIds(list);
	}

	@Override
	public void saveMajorChange(MajorChange s) {
		MajorChangeMapper.insertMajorChange(s);
	}

	@Override
	public void changeMajorChange(Map map) {
		MajorChangeMapper.updateMajorChange(map);
	}

	@Override
	public void removeMajorChangeById(String id) {
		MajorChangeMapper.deleteMajorChangeById(id);
	}
	
	

}
