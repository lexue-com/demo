package com.springbootMVC.springDataJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootMVC.common.entity.ResponseBaseHeader;
import com.springbootMVC.springDataJpa.entity.Account;
import com.springbootMVC.springDataJpa.repository.AccountRepository;


@Service
public class AccountDemoService {
	
	@Autowired
	AccountRepository  accountRepository;
	
	public List<Account> queryAccount(){
		return accountRepository.findAll();
	}
	
	public ResponseBaseHeader register(Account account) {
		
		try {
			accountRepository.save(account);
		} catch (Exception e) {
			return ResponseBaseHeader.buildFaild(null);
		}
		return ResponseBaseHeader.buildSuccess(null);
		
	}
	
	
}
