package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.EngageInterview;

@Repository
public interface EngageInterviewMapper {
	public List<EngageInterview> findEngageInterviewAll();
	public List<EngageInterview> findEngageInterviewByIds(List list);
	public List<EngageInterview> findEngageInterviewByInterviewStatus(String interviewStatus);
	public void insertEngageInterview(EngageInterview s);
	public void updateEngageInterview(Map map);
	public void deleteEngageInterviewById(String einId);
	public EngageInterview findEngageInterviewByResumeId(String resumeId);
	public void updateEngageInterviewByResumeId(Map map);
}
