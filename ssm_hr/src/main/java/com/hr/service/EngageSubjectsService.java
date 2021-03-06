package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.dto.EngageSubjectsAndAmount;
import com.hr.pojo.EngageSubjects;

public interface EngageSubjectsService {
	public List<EngageSubjects> findEngageSubjectsAll();
	public List<EngageSubjects> findEngageSubjectsByIds(List list);
	public void saveEngageSubjects(EngageSubjects s);
	public void changeEngageSubjects(Map map);
	public void removeEngageSubjectsById(String id);
	public List<EngageSubjects> findchooseQuery(Map map);
	public List<EngageSubjectsAndAmount> findEngageSubjectsAndAmount();
	public List<EngageSubjects> findEngageSubjectsBysuiji(Map map);
}
