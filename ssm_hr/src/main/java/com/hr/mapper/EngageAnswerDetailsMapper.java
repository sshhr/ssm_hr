package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.dto.EngageAnswerDetailAndEngageSubjects;
import com.hr.pojo.EngageAnswerDetails;

@Repository
public interface EngageAnswerDetailsMapper {
	public List<EngageAnswerDetails> findEngageAnswerDetailsAll();
	public List<EngageAnswerDetails> findEngageAnswerDetailsByIds(List list);
	public void insertEngageAnswerDetails(EngageAnswerDetails s);
	public void updateEngageAnswerDetails(Map map);
	public void updateEngageAnswerDetailsBysubjectIdAndanswerNumber(Map map);
	public void deleteEngageAnswerDetailsById(String andId);
	public List<EngageAnswerDetailAndEngageSubjects> findengageAnswerDetailAndEngageSubjectsByanswerNumber(String answerNumber);
}
