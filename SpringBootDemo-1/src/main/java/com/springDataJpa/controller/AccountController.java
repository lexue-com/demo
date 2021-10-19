package com.springDataJpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
	
	@RequestMapping("/queryAccount")
	public String queryAccount(){
		
		
		
		return "queryAccount";
	}
	
	@GetMapping("/registerGet")
	public String registerGet() {
		
		
		
		return "register";
	}

}
