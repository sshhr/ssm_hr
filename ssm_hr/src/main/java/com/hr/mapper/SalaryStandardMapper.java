package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.SalaryStandard;

@Repository
public interface SalaryStandardMapper {
	public List<SalaryStandard> findSalaryStandardAll();
	public List<SalaryStandard> findSalaryStandardByIds(List list);
	public void insertSalaryStandard(SalaryStandard s);
	public void updateSalaryStandard(Map map);
	public void deleteSalaryStandardById(String ssdId);
	
}
