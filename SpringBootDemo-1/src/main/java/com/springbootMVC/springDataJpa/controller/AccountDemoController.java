package com.springbootMVC.springDataJpa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootMVC.common.entity.ResponseBaseHeader;
import com.springbootMVC.springDataJpa.entity.Account1;
import com.springbootMVC.springDataJpa.service.AccountDemoService;

@Controller
public class AccountDemoController {
	
	@Autowired
	AccountDemoService accountService;
	
	@RequestMapping("/queryAccount")
	public String queryAccount(ModelMap map){
		List<Account1> list = accountService.queryAccount();
		map.put("allAccount", list);
		return "queryAccount";
	}
	
	
	
	@GetMapping("/registerGet")
	public String registerGet(HttpServletRequest request,Account1 account) {
		
		System.out.println("-----get------");
		ResponseBaseHeader responseBaseHeader = accountService.register(account);
		request.setAttribute("response", responseBaseHeader);
		return "register";
	}
	
	@PostMapping("/registerPost")
	public String registerPost(HttpServletRequest request,Account1 account) {
		
		System.out.println("-----post------");
		ResponseBaseHeader responseBaseHeader = accountService.register(account);
		request.setAttribute("response", responseBaseHeader);
		return "register";
	}


}
