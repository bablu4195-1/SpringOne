package com.bablu.springOne;

public class CricketCoach implements Coach {
	
	private FortuneService theFortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		theFortuneService = fortuneService;
	}
	
  public String getDailyWorkOut() {
	return "Practice catches";
  }

@Override
public String getFortune() {
	
	return theFortuneService.getFortune();
}
}
