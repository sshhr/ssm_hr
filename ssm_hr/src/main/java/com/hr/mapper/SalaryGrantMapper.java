package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.SalaryGrant;

@Repository
public interface SalaryGrantMapper {
	public List<SalaryGrant> findSalaryGrantAll();
	public List<SalaryGrant> findSalaryGrantByIds(List list);
	public void insertSalaryGrant(SalaryGrant s);
	public void updateSalaryGrant(Map map);
	public void deleteSalaryGrantById(String sgrId);
	
}
