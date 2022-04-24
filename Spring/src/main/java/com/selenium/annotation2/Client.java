package com.selenium.annotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegConfig.class);
		College college = context.getBean("collegeBean", College.class);
		System.out.println("The college object created is: "+college);
		college.test();
		((AnnotationConfigApplicationContext)context).close();
	}
}
