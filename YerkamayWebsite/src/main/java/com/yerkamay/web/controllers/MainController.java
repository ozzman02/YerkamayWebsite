package com.yerkamay.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping({"/", "index"})
	public String getIndex(ModelAndView modelAndView) {
		return "index";
	}
	
}
