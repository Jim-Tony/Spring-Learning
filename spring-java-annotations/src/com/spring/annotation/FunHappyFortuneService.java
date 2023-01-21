package com.spring.annotation;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FunHappyFortuneService implements FortuneService {

	private ArrayList<String> as = new ArrayList<String>();
	@Value("${fort.one}")
	private String one;
	
	@Value("${fort.two}")
	private String two;
	
	@Value("${fort.three}")
	private String three;
	
	@Value("${fort.four}")
	private String four;
	
	private Random rand = new Random();
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		as.add(one);
		as.add(two);
		as.add(three);
		as.add(four);
		int index = rand.nextInt(as.size());
		return as.get(index);
	}
	

}
