package com.selenium.assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import org.springframework.beans.factory.annotation.Value;

public class JdbcConnection {
	private String driver;
	private String url;
	private String username;
	private String password;
	
	public JdbcConnection() {
		// TODO Auto-generated constructor stub
		System.out.println("hello");
	}
	
	@Value("${postgre.driver}")
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	@Value("${postgre.url}")
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Value("${postgre.username}")
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Value("${postgre.password}")
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void display() {
		System.out.println("Driver: "+driver);
		System.out.println("Url: "+url);
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
	}
	
	public void connection() throws Exception {
		Class.forName(driver);
		Connection c = DriverManager.getConnection(url, username, password);
		
		System.out.println("Connection Successful " + c);
	}
}
