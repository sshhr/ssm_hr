package com.hr.mapper;

import java.util.List;
import java.util.Map;



import org.springframework.stereotype.Repository;

import com.hr.pojo.Training;

@Repository
public interface TrainingMapper {
	public List<Training> findTrainingAll();
	public List<Training> findTrainingByIds(List list);
	public void insertTraining(Training s);
	public void updateTraining(Map map);
	public void deleteTrainingById(String traId);
	
}
