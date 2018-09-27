package com.maincontroller;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Emp;

@Controller
public class EmpController {

	@RequestMapping("/empform")
	public ModelAndView showform(){

		return new ModelAndView("empform","command", new Emp());
		
	}
	
	@RequestMapping(value="/save" ,method =RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Emp emp){
		
		System.out.println(emp.getId() + " "+ emp.getName() + " "+ emp.getDesignation() + " "+emp.getPassword());
		return new ModelAndView("redirect:/viewemp.html");
		
	}
	
	@RequestMapping("viewemp")
	public ModelAndView viewemp(){
		List<Emp> list =  new ArrayList<Emp>();
		list.add(new Emp(1,"rahul","S.Engineer","admin"));  
	    list.add(new Emp(2,"aditya","IT Manager","admin"));  
	    list.add(new Emp(3,"sachin","Care Taker","admin"));  
	          
	    return new ModelAndView("viewemp","list",list);

	}
	
}
