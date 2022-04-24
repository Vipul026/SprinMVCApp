package com.selenium.assignment1;

import java.sql.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		JdbcConnection jdbc = context.getBean("jdbc", JdbcConnection.class);
		
		jdbc.display();
		jdbc.connection();
	}
}
