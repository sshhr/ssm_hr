package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.EngageInterview;

public interface EngageInterviewService {
	public List<EngageInterview> findEngageInterviewAll();
	public List<EngageInterview> findEngageInterviewByIds(List list);
	public void saveEngageInterview(EngageInterview s);
	public void changeEngageInterview(Map map);
	public void removeEngageInterviewById(String id);
}
