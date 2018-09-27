package com.template.pojo;

public class Admin {

	private int id;
	private String name , password;
	public int getId() {
		return id;
	}
	
	public Admin() {
			}
	
	public Admin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	
	public Admin(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
