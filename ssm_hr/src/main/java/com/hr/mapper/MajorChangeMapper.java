package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.MajorChange;

@Repository
public interface MajorChangeMapper {
	public List<MajorChange> findMajorChangeAll();
	public List<MajorChange> findMajorChangeByIds(List list);
	public void insertMajorChange(MajorChange s);
	public void updateMajorChange(Map map);
	public void deleteMajorChangeById(String mchId);
	
}
