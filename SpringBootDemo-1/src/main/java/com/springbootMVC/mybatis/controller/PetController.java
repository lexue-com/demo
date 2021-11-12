package com.springbootMVC.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springbootMVC.mybatis.pojo.Pet;
import com.springbootMVC.mybatis.service.PetService;

@Controller
public class PetController {
	
	@Autowired
	PetService petService;
	
	@RequestMapping("/getPetList")
	@ResponseBody
	public Object getPetList(@RequestParam Integer id) throws Exception {
		
		List<Pet> petList = petService.getPetList(id);
		return petList;
	}
	

}
