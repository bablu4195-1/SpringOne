package com.bablu.springOne;

public class BaseballCoach implements Coach {
	
	//Dependency Injection
	
	//define dependency field(variable)
	private FortuneService fortuneService;
	
	//constructor for dependency
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
   
	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}
}
