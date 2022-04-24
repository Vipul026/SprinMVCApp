package com.selenium.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	
	@Autowired
	@Qualifier("octopusObject")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
//	public Human() {
//		
//	}
	
//	public Human(Heart heart) {
//		this.heart = heart;
//	}
	
	public void startPumping() {
		if(heart != null) {
			heart.pump();
			System.out.println("name: "+heart.getNameOfAnimal()+" hearts: "+heart.getNoOfHeart());
		}
		else {
			System.out.println("Dead!!");
		}
		
	}
}
