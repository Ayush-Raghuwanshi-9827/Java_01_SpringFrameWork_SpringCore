package com.springcore.Autowired.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
//	public Student(Address address) {
//		super();
//		this.address = address;
//		System.out.println("Constructor Injection Called");
//	}
	@Autowired
	@Qualifier("address1")
	private Address address;
	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter Injection Called");
	}
	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	

}
