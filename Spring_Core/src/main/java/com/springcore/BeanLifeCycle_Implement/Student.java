package com.springcore.BeanLifeCycle_Implement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("st1")
public class Student implements InitializingBean, DisposableBean{
	
	@Value("101")
	private int id;
	
	@Value("Ayush Raghuwanshi")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("object destroyed successfully");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Object initialized successfully");
	}

}
