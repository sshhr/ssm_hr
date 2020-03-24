package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.dto.EngageAnswerDetailAndEngageSubjects;
import com.hr.pojo.EngageExamDetails;

@Repository
public interface EngageExamDetailsMapper {
	public List<EngageExamDetails> findEngageExamDetailsAll();
	public List<EngageExamDetails> findEngageExamDetailsByIds(List list);
	public void insertEngageExamDetails(EngageExamDetails s);
	public void updateEngageExamDetails(Map map);
	public void updateEngageAnswerDetailsBysubjectIdAndanswerNumber(Map map);
	public void deleteEngageExamDetailsById(String exdId);
	public List<EngageExamDetails> findEngageExamDetailsByExamNumber(String examNumber);
}
