package com.luv2code.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoggyStyleCoach implements Coach{
	
	private FortuneService fortuneService;
	
	// default constructor, it will run everytime due to component annotation, even though the class object is not called.
	public DoggyStyleCoach() {
		System.out.println("Inside vagina  constructor");
	}
	
	// define the setter method
	// we can add any method above i.e method name can be any, just add autowired annotation
	@Autowired //auto wired works for setter methods as well just like constructors.
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside DoggyStyle setter method"); // it will print statement everytime due to autowired annotation, 
																//even though the object of class is not used.
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
