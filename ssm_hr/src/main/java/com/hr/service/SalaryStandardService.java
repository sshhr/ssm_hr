package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.SalaryStandard;

public interface SalaryStandardService {
	public List<SalaryStandard> findSalaryStandardAll();
	public List<SalaryStandard> findSalaryStandardByIds(List list);
	public void saveSalaryStandard(SalaryStandard s);
	public void changeSalaryStandard(Map map);
	public void removeSalaryStandardById(String id);
}
