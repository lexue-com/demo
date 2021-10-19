package com.example.dao;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.entity.City;

@Repository
public class DemoForCacheDao {
	
	static Map<Integer,City> dataMap = Collections.synchronizedMap(new HashMap<Integer,City>());

	public void addCity(City city) throws Exception{

		if (null != city ) {
			City data = dataMap.get(city.getId());
			if (null == data) {
				dataMap.put(city.getId(), city);
			}
			else {
				throw new Exception("数据已存在");
			}
		}
	}
	
	public Map<Integer,City> findAllCity(){
		return dataMap;
	}

	
}
