package com.spring.annotation;

import org.springframework.stereotype.Component;

//Using default bean id
@Component
public class CarromCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Nice workout should be done";
	}
 
}
