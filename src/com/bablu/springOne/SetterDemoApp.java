package com.bablu.springOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
        ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        
		//retrieve bean from spring container
		VolleyBallCoach VSRCoach = context.getBean("myVolleyBallCoach",VolleyBallCoach.class);
		//call the methods and literal values i.e., private injected fields in VolleyBallCoach class
		System.out.println(VSRCoach.getFortune());
		//calling the private field in VolleyBallCoach 1. Email Address
		System.out.println(VSRCoach.getEmailAddress());
		//calling the private field in VolleyBallCoach 2.Team
		System.out.println(VSRCoach.getTeam());
		
		//close the context
		context.close();
	}

}
