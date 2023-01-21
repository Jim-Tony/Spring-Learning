package com.spring.annotation;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Using default bean id
@Component
public class CarromCoach implements Coach {

//	private FortuneService fortuneService;
//	
//  Constructor injection
//	public CarromCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Nice workout should be done";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
