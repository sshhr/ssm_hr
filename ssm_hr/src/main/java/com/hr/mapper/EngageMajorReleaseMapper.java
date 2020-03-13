package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.EngageMajorRelease;

@Repository
public interface EngageMajorReleaseMapper {
	public List<EngageMajorRelease> findEngageMajorReleaseAll();
	public List<EngageMajorRelease> findEngageMajorReleaseByIds(List list);
	public void insertEngageMajorRelease(EngageMajorRelease s);
	public void updateEngageMajorRelease(Map map);
	public void deleteEngageMajorReleaseById(String mreId);
	
}
