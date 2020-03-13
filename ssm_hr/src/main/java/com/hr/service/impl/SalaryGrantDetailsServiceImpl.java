package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.SalaryGrantDetailsMapper;
import com.hr.pojo.SalaryGrantDetails;
import com.hr.service.SalaryGrantDetailsService;

@Service
public class SalaryGrantDetailsServiceImpl implements SalaryGrantDetailsService {
	@Autowired
	SalaryGrantDetailsMapper SalaryGrantDetailsMapper;

	@Override
	public List<SalaryGrantDetails> findSalaryGrantDetailsAll() {
		// TODO Auto-generated method stub
		return SalaryGrantDetailsMapper.findSalaryGrantDetailsAll();
	}

	@Override
	public List<SalaryGrantDetails> findSalaryGrantDetailsByIds(List list) {
		// TODO Auto-generated method stub
		return SalaryGrantDetailsMapper.findSalaryGrantDetailsByIds(list);
	}

	@Override
	public void saveSalaryGrantDetails(SalaryGrantDetails s) {
		SalaryGrantDetailsMapper.insertSalaryGrantDetails(s);
	}

	@Override
	public void changeSalaryGrantDetails(Map map) {
		SalaryGrantDetailsMapper.updateSalaryGrantDetails(map);
	}

	@Override
	public void removeSalaryGrantDetailsById(String id) {
		SalaryGrantDetailsMapper.deleteSalaryGrantDetailsById(id);
	}
	
	

}
