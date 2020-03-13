package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.SalaryGrantMapper;
import com.hr.pojo.SalaryGrant;
import com.hr.service.SalaryGrantService;

@Service
public class SalaryGrantServiceImpl implements SalaryGrantService {
	@Autowired
	SalaryGrantMapper SalaryGrantMapper;

	@Override
	public List<SalaryGrant> findSalaryGrantAll() {
		// TODO Auto-generated method stub
		return SalaryGrantMapper.findSalaryGrantAll();
	}

	@Override
	public List<SalaryGrant> findSalaryGrantByIds(List list) {
		// TODO Auto-generated method stub
		return SalaryGrantMapper.findSalaryGrantByIds(list);
	}

	@Override
	public void saveSalaryGrant(SalaryGrant s) {
		SalaryGrantMapper.insertSalaryGrant(s);
	}

	@Override
	public void changeSalaryGrant(Map map) {
		SalaryGrantMapper.updateSalaryGrant(map);
	}

	@Override
	public void removeSalaryGrantById(String id) {
		SalaryGrantMapper.deleteSalaryGrantById(id);
	}
	
	

}
