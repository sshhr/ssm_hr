package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.HumanFileDigMapper;
import com.hr.pojo.HumanFileDig;
import com.hr.service.HumanFileDigService;

@Service
public class HumanFileDigServiceImpl implements HumanFileDigService {
	@Autowired
	HumanFileDigMapper HumanFileDigMapper;

	@Override
	public List<HumanFileDig> findHumanFileDigAll() {
		// TODO Auto-generated method stub
		return HumanFileDigMapper.findHumanFileDigAll();
	}

	@Override
	public List<HumanFileDig> findHumanFileDigByIds(List list) {
		// TODO Auto-generated method stub
		return HumanFileDigMapper.findHumanFileDigByIds(list);
	}

	@Override
	public void saveHumanFileDig(HumanFileDig s) {
		HumanFileDigMapper.insertHumanFileDig(s);
	}

	@Override
	public void changeHumanFileDig(Map map) {
		HumanFileDigMapper.updateHumanFileDig(map);
	}

	@Override
	public void removeHumanFileDigById(String id) {
		HumanFileDigMapper.deleteHumanFileDigById(id);
	}
	
	

}
