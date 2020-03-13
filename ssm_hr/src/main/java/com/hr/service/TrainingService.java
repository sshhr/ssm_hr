package com.hr.service;

import java.util.List;
import java.util.Map;

import com.hr.pojo.Training;

public interface TrainingService {
	public List<Training> findTrainingAll();
	public List<Training> findTrainingByIds(List list);
	public void saveTraining(Training s);
	public void changeTraining(Map map);
	public void removeTrainingById(String id);
}
