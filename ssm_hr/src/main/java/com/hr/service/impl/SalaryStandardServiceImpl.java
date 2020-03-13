package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.SalaryStandardMapper;
import com.hr.pojo.SalaryStandard;
import com.hr.service.SalaryStandardService;

@Service
public class SalaryStandardServiceImpl implements SalaryStandardService {
	@Autowired
	SalaryStandardMapper SalaryStandardMapper;

	@Override
	public List<SalaryStandard> findSalaryStandardAll() {
		// TODO Auto-generated method stub
		return SalaryStandardMapper.findSalaryStandardAll();
	}

	@Override
	public List<SalaryStandard> findSalaryStandardByIds(List list) {
		// TODO Auto-generated method stub
		return SalaryStandardMapper.findSalaryStandardByIds(list);
	}

	@Override
	public void saveSalaryStandard(SalaryStandard s) {
		SalaryStandardMapper.insertSalaryStandard(s);
	}

	@Override
	public void changeSalaryStandard(Map map) {
		SalaryStandardMapper.updateSalaryStandard(map);
	}

	@Override
	public void removeSalaryStandardById(String id) {
		SalaryStandardMapper.deleteSalaryStandardById(id);
	}
	
	

}
