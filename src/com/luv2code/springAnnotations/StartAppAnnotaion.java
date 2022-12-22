package com.luv2code.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartAppAnnotaion {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		SexCoach coach = context.getBean("sexCoach", SexCoach.class);
//		DoggyStyleCoach Dcoach = context.getBean("doggyStyleCoach", DoggyStyleCoach.class);
		MissionaryCoach Mcoach = context.getBean("missionaryCoach", MissionaryCoach.class);
//		coach.getDailySchedule();
//		Dcoach.getDailySchedule();
		Mcoach.getDailySchedule();
//		System.out.println(coach.getLuckySexDay());
//		System.out.println(Dcoach.getLuckySexDay());
		System.out.println(Mcoach.getLuckySexDay());
		context.close();

	}

}
