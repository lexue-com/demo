package com.springbootMVC.oa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index1(HttpServletRequest request) {
		return "index";
	}
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		return "index";
	}

}
