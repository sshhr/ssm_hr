package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.EngageExamDetails;

public interface EngageExamDetailsService {
	public List<EngageExamDetails> findEngageExamDetailsAll();
	public List<EngageExamDetails> findEngageExamDetailsByIds(List list);
	public void saveEngageExamDetails(EngageExamDetails s);
	public void changeEngageExamDetails(Map map);
	public void removeEngageExamDetailsById(String id);
	public List<EngageExamDetails> findEngageExamDetailsByExamNumber(String examNumber);
}
