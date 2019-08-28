package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
@Override
	public String getDailyWorkout() {
		
		return "Practice your bachand volley";
	}

	@PostConstruct
     public void doMyStuff() {
		System.out.println("inside my doMystuff method");
    }
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		
		System.out.println("inside my PreDestroy");
		
	}
	

}
