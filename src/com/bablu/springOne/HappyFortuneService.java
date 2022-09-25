package com.bablu.springOne;
import java.util.Random;
public class HappyFortuneService implements FortuneService {
    private String[] fortunes = {
    		"Its a good day",
    		"It's your lucky day!",
    		"It's going to be an amazing day"
    };
    
   private Random myRandomFortune = new Random();
	@Override
	public String getFortune() {
		int index = myRandomFortune.nextInt(fortunes.length);
		
		String myPerformance = fortunes[index];
		return myPerformance;
	}

}
