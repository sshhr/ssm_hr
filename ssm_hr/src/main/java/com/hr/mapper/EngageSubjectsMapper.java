package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.EngageSubjects;

@Repository
public interface EngageSubjectsMapper {
	public List<EngageSubjects> findEngageSubjectsAll();
	public List<EngageSubjects> findEngageSubjectsByIds(List list);
	public void insertEngageSubjects(EngageSubjects s);
	public void updateEngageSubjects(Map map);
	public void deleteEngageSubjectsById(String subId);
	public List<EngageSubjects> findchooseQuery(Map map);
}
