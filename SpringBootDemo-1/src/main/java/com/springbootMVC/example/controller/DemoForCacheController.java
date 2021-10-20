package com.springbootMVC.example.controller;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootMVC.example.entity.City;
import com.springbootMVC.example.service.DemoForCacheService;

@Controller
public class DemoForCacheController {
	
	@Autowired
	DemoForCacheService demoForCaheService;
	
	@RequestMapping("/addCity")
	public String addCity(@ModelAttribute City city,ModelMap map) {
		System.out.println(ToStringBuilder.reflectionToString(city));
		String msgString = demoForCaheService.addCity(city);
		map.put("returnMsg", msgString);
		return "addCity";
	}
	
	
	@RequestMapping("/findAllCity")
	public String findAllCity(ModelMap map) {
		
		List<City> cityList = demoForCaheService.findAllCity();
		map.put("cityList", cityList);
		return "findAllCity";
	}

}
