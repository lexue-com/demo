package com.springbootMVC.oa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootMVC.common.entity.ResponseBaseHeader;
import com.springbootMVC.oa.mapper.AccountDAO;
import com.springbootMVC.oa.pojo.Account;
import com.springbootMVC.oa.pojo.AccountExample;

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
	
	public Account finddAccountByAccount(String loginName,String password) {
		AccountExample example = new AccountExample();
		example.createCriteria().andLoginNameEqualTo(loginName).andPasswordEqualTo(password);
		List<Account>  accountList = accountDao.selectByExample(example);
		return accountList.size() == 0 ? null : accountList.get(0);
	} 

}
