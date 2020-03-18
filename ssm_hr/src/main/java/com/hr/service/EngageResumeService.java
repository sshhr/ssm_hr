package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.EngageResume;

public interface EngageResumeService {
	public List<EngageResume> findEngageResumeAll();
	public List<EngageResume> findEngageResumeByIds(List list);
	public void saveEngageResume(EngageResume s);
	public void changeEngageResume(Map map);
	public void removeEngageResumeById(String id);
	public List<EngageResume> findchooseQuery(Map map);
}
