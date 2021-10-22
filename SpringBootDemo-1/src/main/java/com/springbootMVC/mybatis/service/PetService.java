package com.springbootMVC.mybatis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootMVC.mybatis.mapper.Pet;
import com.springbootMVC.mybatis.mapper.PetMapper;

@Service
public class PetService {
	
	@Autowired
	PetMapper petMapper;
	
	public List<Pet> getPetList (Integer id) throws Exception{
		
		List<Pet> petList = new ArrayList<Pet>();
		try {
			petList  = petMapper.getPetList(id);
		} catch (Exception e) {
			throw new Exception("查询报错："+e.getMessage());
		}
		
		
		return petList;
	}

}
