package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.dto.EExam;
import com.hr.pojo.EngageExam;

@Repository
public interface EngageExamMapper {
	public List<EngageExam> findEngageExamAll();
	public List<EngageExam> findEngageExamByIds(List list);
	public void insertEngageExam(EngageExam s);
	public void updateEngageExam(Map map);
	public void deleteEngageExamById(String exaId);
	public List<EExam> findEngageExamAllCategoryamount();
}
