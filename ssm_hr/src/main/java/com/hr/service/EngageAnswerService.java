package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.EngageAnswer;

public interface EngageAnswerService {
	public List<EngageAnswer> findEngageAnswerAll();
	public List<EngageAnswer> findEngageAnswerByIds(List list);
	public void saveEngageAnswer(EngageAnswer s);
	public void changeEngageAnswer(Map map);
	public void removeEngageAnswerById(String id);
}
