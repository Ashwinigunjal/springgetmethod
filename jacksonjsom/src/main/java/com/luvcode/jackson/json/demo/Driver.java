package com.luvcode.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		
			ObjectMapper mapper = new ObjectMapper();
			Student student = mapper.readValue(new File("data/input.json"), Student.class);
		
			System.out.println("id : "+ student.getId());
			System.out.println("name : "+ student.getName());
			System.out.println("lname: "+ student.getLname());
			System.out.println("dist" + student.getAddress().getTal());
			System.out.println("lang: "+ student.getLanguage());
			
			for(String l : student.getLanguage()){
				
				System.out.println(l);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
