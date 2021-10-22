package com.springbootMVC.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface PetMapper {

	List<Pet> getPetList(Integer id);

}
