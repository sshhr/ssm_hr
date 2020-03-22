package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.dto.EExam;
import com.hr.pojo.EngageExam;

public interface EngageExamService {
	public List<EngageExam> findEngageExamAll();
	public List<EngageExam> findEngageExamByIds(List list);
	public void saveEngageExam(EngageExam s);
	public void changeEngageExam(Map map);
	public void removeEngageExamById(String id);
	public List<EExam> findEngageExamAllCategoryamount();
}
