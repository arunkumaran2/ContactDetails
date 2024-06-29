package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {

	@Id
	private String Name;
	private long Mobile_Number;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getMobile_Number() {
		return Mobile_Number;
	}
	public void setMobile_Number(long mobile_Number) {
		Mobile_Number = mobile_Number;
	}
	
	
}
