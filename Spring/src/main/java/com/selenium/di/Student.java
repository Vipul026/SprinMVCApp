package com.selenium.di;

public class Student {
//	private String studentName;
//	private int studentId;
//	
//	public Student(int studentId, String studentName) {
//		this.studentId = studentId;
//		this.studentName = studentName;
//	}
//
//	public void display() {
//		System.out.println("Student name is: "+studentName);
//		System.out.println("Student ID is: "+studentId);
//	}
	
	private MathCheat mathcheat;
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}
	
	public void cheating() {
		mathcheat.mathCheat();
	}
	
}
