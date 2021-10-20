package com.springbootMVC.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootMVC.example.dao.DemoForCacheDao;
import com.springbootMVC.example.entity.City;

@Service
public class DemoForCacheService {
	
	@Autowired 
	DemoForCacheDao demoForCacheDao;
	
	public String addCity(City city) {
		try {
			demoForCacheDao.addCity(city);
			return "保存成功";
		} catch (Exception e) {
			return "保存失败";
		}
	}
	
	
	public List<City> findAllCity(){
		Map<Integer, City> dataMap = demoForCacheDao.findAllCity();
		return new ArrayList<>(dataMap.values());
	}


}
