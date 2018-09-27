package com.template.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.template.Dao.AdminDaoPs;
import com.template.pojo.Admin;

public class TestPs {

	
	public static void main(String[] args) {
		   
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
		System.out.println(ctx); 
		AdminDaoPs dao = (AdminDaoPs) ctx.getBean("edaops");
		
		dao.saveAdminByPs(new Admin(21,"AVCOE","Admin"));
		
	
	}
}
