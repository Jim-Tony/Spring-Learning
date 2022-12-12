package com.coach.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService theFortuneService;
	
	//Creating constructor for injections
	public BaseballCoach(FortuneService fortuneService) {
		theFortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min in batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getDailyFortune();
	}
}
