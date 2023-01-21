package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ChessCoach implements Coach {
	
	//Field Injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public void injectDependency(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Knock the king fast";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
