package com.luv2code.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MissionaryCoach implements Coach {
	
	// filed injection happens due to reflection property of java. 
	// No need to create any setter or constructor method in order to inject the dependency. 
	//Just field alone would also work.
	@Autowired
	private FortuneService fortuneService;

	public void getDailySchedule() {
		System.out.println("Try missionary today and dig the hole completely");
	}

	public String getLuckySexDay() {
		return fortuneService.getLuckySexDay();
	}


}
