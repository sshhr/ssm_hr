package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageMajorReleaseMapper;
import com.hr.pojo.EngageMajorRelease;
import com.hr.service.EngageMajorReleaseService;

@Service
public class EngageMajorReleaseServiceImpl implements EngageMajorReleaseService {
	@Autowired
	EngageMajorReleaseMapper EngageMajorReleaseMapper;

	@Override
	public List<EngageMajorRelease> findEngageMajorReleaseAll() {
		// TODO Auto-generated method stub
		return EngageMajorReleaseMapper.findEngageMajorReleaseAll();
	}

	@Override
	public List<EngageMajorRelease> findEngageMajorReleaseByIds(List list) {
		// TODO Auto-generated method stub
		return EngageMajorReleaseMapper.findEngageMajorReleaseByIds(list);
	}

	@Override
	public int saveEngageMajorRelease(EngageMajorRelease s) {
		return EngageMajorReleaseMapper.insertEngageMajorRelease(s);
	}

	@Override
	public void changeEngageMajorRelease(Map map) {
		EngageMajorReleaseMapper.updateEngageMajorRelease(map);
	}

	@Override
	public int removeEngageMajorReleaseById(String id) {
		return EngageMajorReleaseMapper.deleteEngageMajorReleaseById(id);
	}
	
	

}
