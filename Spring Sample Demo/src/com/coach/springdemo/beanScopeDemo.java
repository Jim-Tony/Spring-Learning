package com.coach.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");
		Coach coach1 = context.getBean("baseballCoach",Coach.class);
		Coach coach2 = context.getBean("baseballCoach",Coach.class);
		//To differentiate the diff between singleton and prototype
		System.out.println("Address of first coach "+ coach1);
		System.out.println("Address of second coach "+ coach2);
		System.out.println(coach1.getDailyWorkout());
		context.close();
	}

}
