package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.EngageAnswerDetails;

public interface EngageAnswerDetailsService {
	public List<EngageAnswerDetails> findEngageAnswerDetailsAll();
	public List<EngageAnswerDetails> findEngageAnswerDetailsByIds(List list);
	public void saveEngageAnswerDetails(EngageAnswerDetails s);
	public void changeEngageAnswerDetails(Map map);
	public void removeEngageAnswerDetailsById(String id);
}
