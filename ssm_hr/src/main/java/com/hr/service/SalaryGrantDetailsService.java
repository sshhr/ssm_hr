package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.SalaryGrantDetails;

public interface SalaryGrantDetailsService {
	public List<SalaryGrantDetails> findSalaryGrantDetailsAll();
	public List<SalaryGrantDetails> findSalaryGrantDetailsByIds(List list);
	public void saveSalaryGrantDetails(SalaryGrantDetails s);
	public void changeSalaryGrantDetails(Map map);
	public void removeSalaryGrantDetailsById(String id);
}
