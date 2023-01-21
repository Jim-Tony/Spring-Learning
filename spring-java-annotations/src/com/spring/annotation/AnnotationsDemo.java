package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach c1 = context.getBean("chessCoach",Coach.class);
		System.out.println(c1.getDailyWorkout());
		System.out.println(c1.getDailyFortune());
		context.close();
	}

}
