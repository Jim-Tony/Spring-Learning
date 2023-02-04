package com.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaAnnotationsNoXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach c1 = context.getBean("carromCoach",Coach.class);
		System.out.println(c1.getDailyWorkout());
		System.out.println(c1.getDailyFortune());
		context.close();
	}

}
