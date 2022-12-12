package com.coach.springdemo;

public class TrackCoach implements Coach {

	private FortuneService theFortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run Daily 5 kilometer";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Track : hey dood "+ theFortuneService.getDailyFortune();
	}

}
