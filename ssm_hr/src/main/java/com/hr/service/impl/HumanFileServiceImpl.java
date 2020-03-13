package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.HumanFileMapper;
import com.hr.pojo.HumanFile;
import com.hr.service.HumanFileService;

@Service
public class HumanFileServiceImpl implements HumanFileService {
	@Autowired
	HumanFileMapper HumanFileMapper;

	@Override
	public List<HumanFile> findHumanFileAll() {
		// TODO Auto-generated method stub
		return HumanFileMapper.findHumanFileAll();
	}

	@Override
	public List<HumanFile> findHumanFileByIds(List list) {
		// TODO Auto-generated method stub
		return HumanFileMapper.findHumanFileByIds(list);
	}

	@Override
	public void saveHumanFile(HumanFile s) {
		HumanFileMapper.insertHumanFile(s);
	}

	@Override
	public void changeHumanFile(Map map) {
		HumanFileMapper.updateHumanFile(map);
	}

	@Override
	public void removeHumanFileById(String id) {
		HumanFileMapper.deleteHumanFileById(id);
	}
	
	

}
