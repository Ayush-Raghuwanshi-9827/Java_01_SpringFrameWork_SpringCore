package com.javaConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	public Enjoy getEnjoy() {
		return new Enjoy();
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(getEnjoy());
		return student;
	}

}
