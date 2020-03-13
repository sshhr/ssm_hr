package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.SalaryGrantDetails;

@Repository
public interface SalaryGrantDetailsMapper {
	public List<SalaryGrantDetails> findSalaryGrantDetailsAll();
	public List<SalaryGrantDetails> findSalaryGrantDetailsByIds(List list);
	public void insertSalaryGrantDetails(SalaryGrantDetails s);
	public void updateSalaryGrantDetails(Map map);
	public void deleteSalaryGrantDetailsById(String grdId);
	
}
