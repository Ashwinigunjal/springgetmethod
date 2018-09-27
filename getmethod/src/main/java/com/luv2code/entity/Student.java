package com.luv2code.entity;

public class Student {

	private int id;
	private String name;
	private String lname;
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
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Student(int id, String name, String lname) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
	}
	
	
	
	
	
}


