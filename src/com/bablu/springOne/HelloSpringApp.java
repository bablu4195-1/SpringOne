package com.bablu.springOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
	
		//load the configuration file
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach fieldCoach = context.getBean("myCoach",Coach.class);
		
		//call the methods on the bean
		System.out.println(fieldCoach.getDailyWorkOut());
		
		//call the new methods for fortunes
		System.out.println(fieldCoach.getFortune());
		
		
		//close the context
         context.close();
	}

}
