package com.javaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private Enjoy enj;

	public Student(Enjoy enj) {
		super();
		this.enj = enj;
	}
	@Value("Ayush Raghuwanshi")
	private String name;
	
	@Override
	public String toString() {
		return "Student [enj=" + enj + ", name=" + name + "]";
	}
	public void study() {
		this.enj.Feel();
		System.out.println("Student is studing");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Enjoy getEnj() {
		return enj;
	}
	public void setEnj(Enjoy enj) {
		this.enj = enj;
	}

}
