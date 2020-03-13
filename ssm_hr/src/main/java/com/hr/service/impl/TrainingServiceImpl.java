package com.hr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.TrainingMapper;
import com.hr.pojo.Training;
import com.hr.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService {
	@Autowired
	TrainingMapper TrainingMapper;

	@Override
	public List<Training> findTrainingAll() {
		// TODO Auto-generated method stub
		return TrainingMapper.findTrainingAll();
	}

	@Override
	public List<Training> findTrainingByIds(List list) {
		// TODO Auto-generated method stub
		return TrainingMapper.findTrainingByIds(list);
	}

	@Override
	public void saveTraining(Training s) {
		TrainingMapper.insertTraining(s);
	}

	@Override
	public void changeTraining(Map map) {
		TrainingMapper.updateTraining(map);
	}

	@Override
	public void removeTrainingById(String id) {
		TrainingMapper.deleteTrainingById(id);
	}
	
	

}
