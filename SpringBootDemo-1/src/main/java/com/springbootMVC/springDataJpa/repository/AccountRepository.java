package com.springbootMVC.springDataJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootMVC.springDataJpa.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>  {
	

}
