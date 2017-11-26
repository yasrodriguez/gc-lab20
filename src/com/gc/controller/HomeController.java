package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Yasmin Rodriguez
 *
 */

@Controller
public class HomeController {

	@RequestMapping("/register")
	public String register() {
		
		return "register";
	}
	
	@RequestMapping("/registrationConfirmation")
	public ModelAndView getConfirmation() {
		
		return new ModelAndView("register", "", "");
	}
}