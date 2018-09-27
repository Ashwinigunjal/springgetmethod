package com.maincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeWorldController {

	@RequestMapping("/welcome")
	public ModelAndView welcomeworld(){
		String message="This is welcome page";
		return new ModelAndView("welcomepage","message",message);
			
	}
	
	
}
