package com.pojo;

public class Emp {

	private int id;
	private String name, designation, password;
	
	public Emp(int id, String name, String designation, String password) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.password = password;
	}
	public Emp() {
		// TODO Auto-generated constructor stub
	}
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
