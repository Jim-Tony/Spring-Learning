package com.spring.annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Be aware today",
			"Be safe today",
			"Don't trust anybody"
	};
	
	private Random r = new Random();
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		int index = r.nextInt(data.length);
		
		return data[index];
	}

}
