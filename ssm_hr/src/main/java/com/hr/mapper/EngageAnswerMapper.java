package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.EngageAnswer;

@Repository
public interface EngageAnswerMapper {
	public List<EngageAnswer> findEngageAnswerAll();
	public List<EngageAnswer> findEngageAnswerByIds(List list);
	public void insertEngageAnswer(EngageAnswer s);
	public void updateEngageAnswer(Map map);
	public void deleteEngageAnswerById(String ansId);
	
}
