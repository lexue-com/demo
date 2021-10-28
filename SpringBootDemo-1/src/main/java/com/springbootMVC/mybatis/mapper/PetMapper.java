package com.springbootMVC.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.springbootMVC.mybatis.entity.Pet;

public interface PetMapper {

	List<Pet> getPetList(Integer id);

}
