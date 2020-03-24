package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.EngageResume;

@Repository
public interface EngageResumeMapper {
	public List<EngageResume> findEngageResumeAll();
	public List<EngageResume> findEngageResumeByIds(List list);
	public void insertEngageResume(EngageResume s);
	public void updateEngageResume(Map map);
	public void deleteEngageResumeById(String resId);
	public List<EngageResume> findchooseQuery(Map map);
	public List<EngageResume> findEngageResumeByCheckStatus(String checkStatus);
	public EngageResume findEngageExamByhumanNameAndhumanIdcard(Map map);
	public void updateEngageResumeByhumanIdcard(Map map);
	public List<EngageResume> findchooseQueryexamfenshu(Map map);
}
