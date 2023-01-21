package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class LuckyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	}

}
