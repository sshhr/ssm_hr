package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.SalaryStandardDetails;

@Repository
public interface SalaryStandardDetailsMapper {
	public List<SalaryStandardDetails> findSalaryStandardDetailsAll();
	public List<SalaryStandardDetails> findSalaryStandardDetailsByIds(List list);
	public void insertSalaryStandardDetails(SalaryStandardDetails s);
	public void updateSalaryStandardDetails(Map map);
	public void deleteSalaryStandardDetailsById(String sdtId);
	
}
