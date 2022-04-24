package com.selenium.objectdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Mobile obj = context.getBean("mobile", Mobile.class);
		obj.call();
	}
}
