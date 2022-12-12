package com.coach.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve Bean
		Coach c1 = context.getBean("myCoach",Coach.class);
		Coach c2 = context.getBean("baseballCoach",Coach.class);
		
		//Call methods on the Bean
		System.out.println(c1.getDailyFortune());
		
		//Closing the context
		context.close();
	}

}
