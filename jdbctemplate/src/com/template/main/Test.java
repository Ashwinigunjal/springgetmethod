package com.template.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.template.Dao.AdminDao;
import com.template.pojo.Admin;

public class Test {

	
	public static void main(String[] args) {
		   
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
		System.out.println(ctx); 
		AdminDao dao = (AdminDao) ctx.getBean("edao");
		Admin a = new Admin();
		int status = dao.save(new Admin("Piyush", "password")); 
		System.out.println(status);
		
		int status1 = dao.updateadmin(new Admin(13,"ashutai","pass"));
		System.out.println(status1);
		
		int status2 = dao.deleteadmin(4);
		System.out.println(status2);
	}
}
