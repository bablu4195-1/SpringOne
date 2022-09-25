package com.bablu.springOne;

public class VolleyBallCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields for email Address and team
	private String emailAddress;
	
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Setter method for VolleyBall Coach- setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Setter method for VolleyBall Coach- setTeam");
		this.team = team;
	}

	//create a no-argument constructor
	public VolleyBallCoach(){
		System.out.println("VolleyBall coach has no  constructor");
	}

    //setter method (private variable are needed to get drawn to outside classes using getter and setter)
	//getter method is not required in this scenario
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter method for VolleyBall Coach- SetFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkOut() {
		return "Practice lfts for the first 1 hour";
	}

	@Override
	public String getFortune() {
		return "You will get it  and prove it ," + fortuneService.getFortune();
	}

}
