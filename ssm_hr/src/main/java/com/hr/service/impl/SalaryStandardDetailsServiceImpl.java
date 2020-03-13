package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.SalaryStandardDetailsMapper;
import com.hr.pojo.SalaryStandardDetails;
import com.hr.service.SalaryStandardDetailsService;

@Service
public class SalaryStandardDetailsServiceImpl implements SalaryStandardDetailsService {
	@Autowired
	SalaryStandardDetailsMapper SalaryStandardDetailsMapper;

	@Override
	public List<SalaryStandardDetails> findSalaryStandardDetailsAll() {
		// TODO Auto-generated method stub
		return SalaryStandardDetailsMapper.findSalaryStandardDetailsAll();
	}

	@Override
	public List<SalaryStandardDetails> findSalaryStandardDetailsByIds(List list) {
		// TODO Auto-generated method stub
		return SalaryStandardDetailsMapper.findSalaryStandardDetailsByIds(list);
	}

	@Override
	public void saveSalaryStandardDetails(SalaryStandardDetails s) {
		SalaryStandardDetailsMapper.insertSalaryStandardDetails(s);
	}

	@Override
	public void changeSalaryStandardDetails(Map map) {
		SalaryStandardDetailsMapper.updateSalaryStandardDetails(map);
	}

	@Override
	public void removeSalaryStandardDetailsById(String id) {
		SalaryStandardDetailsMapper.deleteSalaryStandardDetailsById(id);
	}
	
	

}
