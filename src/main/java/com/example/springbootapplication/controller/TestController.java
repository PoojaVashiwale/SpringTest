package com.example.springbootapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/welcome")
	public ModelAndView show() {
		System.out.println("hello pooja");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","this is my 1st web application");
		mv.setViewName("welcome");
		return mv;
		//return "welcome";
	}
	
}
