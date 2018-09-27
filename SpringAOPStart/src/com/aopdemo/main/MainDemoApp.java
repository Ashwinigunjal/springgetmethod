package com.aopdemo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aopdemo.dao.AccountDao;

public class MainDemoApp {

 public static void main(String args[]){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("DemoConfig.class");
		
		//create dao class object
		AccountDao theAccountDao = context.getBean("accountdao", AccountDao.class);
		//call method
		theAccountDao.addAccount();
		//close context
		
		context.close();
		
	
 }
	
}
