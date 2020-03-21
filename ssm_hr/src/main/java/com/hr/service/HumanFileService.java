package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.HumanFile;

public interface HumanFileService {
	public List<HumanFile> findHumanFileAll();
	public List<HumanFile> findHumanFileByIds(List list);
	public void saveHumanFile(HumanFile s);
	public void changeHumanFile(Map map);
	public void removeHumanFileById(String id);
	public HumanFile findHumanFileByHumanId(String humanid);
	public List<HumanFile>  findHumanFileByStatus(int humanFileStatus);
}
