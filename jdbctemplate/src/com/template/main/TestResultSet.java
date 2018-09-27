package com.template.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.template.Dao.ResultSet;
import com.template.pojo.Admin;

public class TestResultSet {

	public static void main(String[] args) {
		   
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
		System.out.println(ctx); 
		ResultSet dao =  (ResultSet) ctx.getBean("edaors");
		List<Admin> list = new ArrayList<Admin>();
		list = dao.gellAllData();
		
		for(Admin admin : list ){
			
			System.out.println(admin.getId() +" "+ admin.getName() +" "+ admin.getPassword() );
		}
	
	}
}
