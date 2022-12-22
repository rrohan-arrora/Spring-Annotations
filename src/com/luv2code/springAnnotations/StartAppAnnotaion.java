package com.luv2code.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartAppAnnotaion {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SexCoach coach = context.getBean("sexCoach", SexCoach.class);
		coach.getDailySchedule();
		System.out.println(coach.getLuckySexDay());
		context.close();

	}

}
