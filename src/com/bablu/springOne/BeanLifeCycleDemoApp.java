package com.bablu.springOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration
		ClassPathXmlApplicationContext  context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		//retrieve bean from spring container
		Coach ourCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(ourCoach.getDailyWorkOut());
        
		System.out.println("Memory Location"+ ourCoach);
		
		//close the context
		context.close();
	}

}
