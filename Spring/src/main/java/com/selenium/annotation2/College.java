package com.selenium.annotation2;

import org.springframework.stereotype.Component;


public class College {
	
	private Principal principal;
	
//	public College(Principal principal) {
//		this.principal = principal;
//	}
	
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
	public void test() {
		principal.principalInfo();
		System.out.println("Testing college method");
	}
}
