package com.bablu.springOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
		//load the spring configuration
		ClassPathXmlApplicationContext  context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from spring container
		Coach ourCoach = context.getBean("myCoach",Coach.class);
		Coach theirCoach = context.getBean("myCoach",Coach.class);
		
		
		boolean result = (ourCoach == theirCoach);
		//pointing to the same object 
		System.out.println(result);
		
		System.out.println("Memory Location"+ ourCoach);
		
		System.out.println("Memory Location of their Coach" + theirCoach);
		//close the context
		context.close();
	}

}
