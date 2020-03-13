package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.SalaryGrant;

public interface SalaryGrantService {
	public List<SalaryGrant> findSalaryGrantAll();
	public List<SalaryGrant> findSalaryGrantByIds(List list);
	public void saveSalaryGrant(SalaryGrant s);
	public void changeSalaryGrant(Map map);
	public void removeSalaryGrantById(String id);
}
