package com.springbootMVC.oa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootMVC.common.entity.ResponseBaseHeader;
import com.springbootMVC.oa.mapper.AccountDAO;
import com.springbootMVC.oa.pojo.Account;

@Service
public class AccountService {

	@Autowired
	AccountDAO accountDao;
	
	public ResponseBaseHeader register(Account account) {
		try {
			accountDao.insert(account);
		} catch (Exception e) {
			return ResponseBaseHeader.buildFaild(null);
		}
		return ResponseBaseHeader.buildSuccess(null);

	}

}
