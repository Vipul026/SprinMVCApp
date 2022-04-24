package com.selenium.annotaion;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	private String name;
	private String course;
	private String hobby;
	
	
	@Value("Excel")
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Value("Football")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Course: "+course);
		System.out.println("hobby: "+hobby);
	}
}
