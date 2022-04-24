package com.selenium.annotation2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.selenium.annotation2")
public class CollegConfig {
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean
	public College collegeBean() {
		College college = new College();
		college.setPrincipal(principalBean());
		return college;
	}
}
