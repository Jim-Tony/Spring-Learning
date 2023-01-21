package com.coach.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanCycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifeCycle-applicationContext.xml");
        
//        Coach c1 = context.getBean("myCoach",Coach.class);
//        System.out.println(c1.getDailyWorkout());
        
         
          Coach t1 = context.getBean("tennisCoach",Coach.class);
          Coach t2 = context.getBean("tennisCoach",Coach.class);
        //To differentiate the diff between singleton and prototype
  		System.out.println("Address of first coach "+ t1);
  		System.out.println("Address of second coach "+ t2);
  		System.out.println(t2.getDailyWorkout() + " " + t1.getDailyFortune());
        context.close();
	}

}
