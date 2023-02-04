package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeAndBeanLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach c1 = context.getBean("chessCoach",Coach.class);
		Coach c2 = context.getBean("chessCoach",Coach.class);
		
		System.out.println("Memory of c1 "+c1);
		System.out.println("Memory of c2 "+c2);
		
		context.close();
		
	}

}
