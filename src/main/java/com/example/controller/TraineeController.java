package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TraineeService;

@RestController
public class TraineeController {

	@Autowired
	TraineeService traineeServie;
	
	@PostMapping("/addTrainee/{traineeName}/{traineeDomain}/{traineeLocation}")
	public void addTrainee(@PathVariable("traineeName") String traineeName, @PathVariable("traineeDomain") String traineeDomain, @PathVariable("traineeLocation") String traineeLocation) {
		traineeServie.addTrainee(traineeName, traineeDomain, traineeLocation);
	}
}
