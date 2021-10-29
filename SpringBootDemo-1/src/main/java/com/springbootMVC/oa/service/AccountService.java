package com.springbootMVC.oa.service;

import org.springframework.stereotype.Service;

import com.springbootMVC.common.entity.ResponseBaseHeader;
import com.springbootMVC.springDataJpa.entity.Account;

@Service
public class AccountService {
public ResponseBaseHeader register(Account account) {
		
		try {
			accountRepository.save(account);
		} catch (Exception e) {
			return ResponseBaseHeader.buildFaild(null);
		}
		return ResponseBaseHeader.buildSuccess(null);
		
	}

}
