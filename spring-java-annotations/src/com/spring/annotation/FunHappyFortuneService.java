package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class FunHappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today will be fun day";
	}

}
