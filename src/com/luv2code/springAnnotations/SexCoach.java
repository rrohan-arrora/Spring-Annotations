package com.luv2code.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SexCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public SexCoach(FortuneService fortuneService){
		this.fortuneService=fortuneService;
	}

	public void getDailySchedule() {
		System.out.println("Do not forget to do sex or at least masterbate");
		
	}

	public String getLuckySexDay() {
		return fortuneService.getLuckySexDay();
	}

}
