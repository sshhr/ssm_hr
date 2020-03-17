package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.EngageMajorRelease;

public interface EngageMajorReleaseService {
	public List<EngageMajorRelease> findEngageMajorReleaseAll();
	public List<EngageMajorRelease> findEngageMajorReleaseByIds(List list);
	public int saveEngageMajorRelease(EngageMajorRelease s);
	public void changeEngageMajorRelease(Map map);
	public int removeEngageMajorReleaseById(String id);
}
