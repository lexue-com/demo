package com.springbootMVC.oa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootMVC.common.entity.ResponseBaseHeader;
import com.springbootMVC.oa.pojo.Account;
import com.springbootMVC.oa.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@GetMapping("/register")
	public String registerGet(HttpServletRequest request,Account account) {
		
		ResponseBaseHeader responseBaseHeader = accountService.register(account);
		request.setAttribute("response", responseBaseHeader);
		return "register";
	}
	
		
}
