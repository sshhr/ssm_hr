package com.hr.service;

import java.util.Map;

import com.hr.pojo.EngageInterview;
import com.hr.pojo.EngageResume;
import com.hr.pojo.HumanFile;

public interface ResumeService {
	public boolean updateResumeAndSaveEngageInterview(EngageResume engageResume,EngageInterview engageInterview);
	public boolean updateResumeAndSaveHumanFile(Map map,HumanFile humanFile);
}
