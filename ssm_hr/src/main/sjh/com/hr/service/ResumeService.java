package com.hr.service;

import com.hr.pojo.EngageInterview;
import com.hr.pojo.EngageResume;

public interface ResumeService {
	public boolean updateResumeAndSaveEngageInterview(EngageResume engageResume,EngageInterview engageInterview);
}
