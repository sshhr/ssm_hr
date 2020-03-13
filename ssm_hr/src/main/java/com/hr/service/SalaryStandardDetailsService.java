package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.SalaryStandardDetails;

public interface SalaryStandardDetailsService {
	public List<SalaryStandardDetails> findSalaryStandardDetailsAll();
	public List<SalaryStandardDetails> findSalaryStandardDetailsByIds(List list);
	public void saveSalaryStandardDetails(SalaryStandardDetails s);
	public void changeSalaryStandardDetails(Map map);
	public void removeSalaryStandardDetailsById(String id);
}
