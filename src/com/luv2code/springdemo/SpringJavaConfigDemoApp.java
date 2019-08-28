package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//Spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		//close the context
		
		//Call our new swim coach methods
		System.out.println("email:"+theCoach.getEmail());
		
		System.out.println("team: "+theCoach.getTeam());
		
		context.close();
		
		//Init and destroy method
		
	}

}
