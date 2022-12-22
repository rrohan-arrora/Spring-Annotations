package com.luv2code.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartAppAnnotaion {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		SexCoach coach = context.getBean("sexCoach", SexCoach.class);
		DoggyStyleCoach Dcoach = context.getBean("doggyStyleCoach", DoggyStyleCoach.class);
//		coach.getDailySchedule();
		Dcoach.getDailySchedule();
//		System.out.println(coach.getLuckySexDay());
		System.out.println(Dcoach.getLuckySexDay());
		context.close();

	}

}
