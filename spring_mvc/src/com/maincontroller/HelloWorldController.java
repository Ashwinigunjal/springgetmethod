package com.maincontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	
	@RequestMapping("/hello")
	public ModelAndView helloworld(){
		String message="welcome to hello world data";
		return new ModelAndView("hellopage","message",message);
	}
	
	@RequestMapping("/formdata")
	public ModelAndView formdata(HttpServletRequest request , HttpServletResponse response){
		String name =request.getParameter("name");
		String pass = request.getParameter("password");
		System.out.println(name + " " + pass);
		
		if(name.equals("admin") && pass.equals("admin")){
			String message = "Hello" + name;
			return new ModelAndView("hellopage","message", message);
		}
		else{
		
			return new ModelAndView("errorpage","message","Sorry, username and password invalid");
		}
		
		
		
	}
}
