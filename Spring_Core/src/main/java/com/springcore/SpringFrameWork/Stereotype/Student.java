package com.springcore.SpringFrameWork.Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("st1")
public class Student {

	@Value("Ayush Raghuwanshi")
	private String name;
	
	@Value("Bhopal")
	private String city;
	
	
	@Value("#{course}")
	private List<String> course;

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", course=" + course + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}
}
