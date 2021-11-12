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
import com.springbootMVC.springDataJpa.entity.Account;
import com.springbootMVC.springDataJpa.service.AccountDemoService;

@Controller
@RequestMapping("/account")
public class AccountDemoController {
	
	@Autowired
	AccountDemoService accountService;
	
	@RequestMapping("/queryAccount")
	public String queryAccount(ModelMap map){
		List<Account> list = accountService.queryAccount();
		map.put("allAccount", list);
		return "account/queryAccount";
	}
	
	
	
	@GetMapping("/registerGet")
	public String registerGet(HttpServletRequest request,Account account) {
		
		System.out.println("-----get------");
		ResponseBaseHeader responseBaseHeader = accountService.register(account);
		request.setAttribute("response", responseBaseHeader);
		return "account/register";
	}
	
	@PostMapping("/registerPost")
	public String registerPost(HttpServletRequest request,Account account) {
		
		System.out.println("-----post------");
		ResponseBaseHeader responseBaseHeader = accountService.register(account);
		request.setAttribute("response", responseBaseHeader);
		return "account/register";
	}


}
