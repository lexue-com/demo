package com.springbootMVC.oa.controller;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springbootMVC.common.entity.ResponseBaseHeader;
import com.springbootMVC.common.entity.SystemConfig;
import com.springbootMVC.oa.pojo.Account;
import com.springbootMVC.oa.service.AccountService;


@Controller
@RequestMapping("/account")
public class AccountController {
	
	private final static Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	AccountService accountService;
	
	@Autowired 
	SystemConfig config;

	@GetMapping("/register")
	public String registerGet(HttpServletRequest request,Account account) {
		
		ResponseBaseHeader responseBaseHeader = accountService.register(account);
		request.setAttribute("response", responseBaseHeader);
		return "account/register";
	}
	
	
	@GetMapping("/login")
	public String login(Model model) {
		
		model.addAttribute("config",config);
		return "account/login";
	}
	
	

	
	
	@RequestMapping("/logOut")
	public String logOut(HttpServletRequest request) {
		
		request.getSession().removeAttribute("account");
		return "index";
	}
	
	
	
	@RequestMapping("/validataAccount")
	@ResponseBody
	public String validataAccount(HttpServletRequest request,String loginName,String password) {
		
		// 1. 直接返回是否登录成功的结果
		// 2. 返回 Account对象，对象是空的 ，在controller里做业务逻辑
		try {
			Account account = accountService.finddAccountByAccount(loginName, password);
			if (null != account) {
				return "success";
			}
		} catch (Exception e) {
			logger.info("登录校验异常", e.getMessage());
		}
		return "fail";
	}
	
	
		
}
