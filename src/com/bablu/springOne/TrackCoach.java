package com.bablu.springOne;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
    
	public TrackCoach() {

    }
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		
		return "Run a hard 5000metres";
	}

	@Override
	public String getFortune() {
		
		return "Just play it and you get it" + fortuneService.getFortune();
	}
	
	//add an init method
	 public void doMyStartUpStuff() {
	    System.out.println("TrackCoach inside method : - Spring Bean init doMyStartUpStuff method");	 
	 }
	
	//add a destroy method
    public void doTheCleaning() {
    	System.out.println("TrackCoach inside method : - Spring Bean destroy doTheCleaning method");
    }
}
