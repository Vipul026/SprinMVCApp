package com.selenium.objectdi;

public class Mobile {
	private Sim sim;
	
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
	public void call() {
		sim.calling();
	}
}
