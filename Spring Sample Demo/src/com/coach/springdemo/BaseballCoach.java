package com.coach.springdemo;

public class BaseballCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min in batting practice";
	}
}
