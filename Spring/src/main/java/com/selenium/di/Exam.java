package com.selenium.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student obj = context.getBean("stu", Student.class);
		
		obj.cheating();
		
//		obj.setStudentName("Vipul");
//		obj.display();
		
	}
}
