package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Trainee;
import com.example.repository.TraineeRepository;

@Service
public class TraineeService {

	@Autowired
	TraineeRepository traineeRepository;
	
	public void addTrainee(String traineeName, String traineeDomain, String traineeLocation) {
	
		Trainee trainee = new Trainee();
		//trainee.setTraineeId(traineeId);
		trainee.setTraineeName(traineeName);
		trainee.setTraineeDomain(traineeDomain);
		trainee.setTraineeLocation(traineeLocation);
		
		traineeRepository.save(trainee);
	}
}
