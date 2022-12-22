package com.luv2code.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoggyStyleCoach implements Coach{
	
	private FortuneService fortuneService;
	
	// default constructor
	public DoggyStyleCoach() {
		System.out.println("Indise vagina  constructor");
	}
	
	// define the setter method
	@Autowired //auto wired works for setter methods as well just like constructors.
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside DoggyStyle setter method");
		this.fortuneService=fortuneService;
	}
	

	public void getDailySchedule() {
		// TODO Auto-generated method stub
		System.out.println("Practice doggy style daily");
		
	}

	public String getLuckySexDay() {
		// TODO Auto-generated method stub
		return fortuneService.getLuckySexDay();
	}

}
