package com.coach.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		String[] fortunes = {"Have a lucky day today!!!",
				"Be carefull today",
				"Enjoy the day"};
		int max = fortunes.length-1;
		int min = 0;
		int random = (int) Math.floor(Math.random()*(max-min+1)+min);
		return fortunes[random];
	}

}
