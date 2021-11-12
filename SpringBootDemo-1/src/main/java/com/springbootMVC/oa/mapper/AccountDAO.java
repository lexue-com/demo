package com.springbootMVC.oa.mapper;

import com.springbootMVC.oa.pojo.Account;
import com.springbootMVC.oa.pojo.AccountExample;
import org.springframework.stereotype.Repository;

/**
 * AccountDAO继承基类
 */
@Repository
public interface AccountDAO extends MyBatisBaseDao<Account, Integer, AccountExample> {
}