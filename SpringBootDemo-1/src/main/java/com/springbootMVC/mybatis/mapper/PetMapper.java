package com.springbootMVC.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.springbootMVC.mybatis.pojo.Pet;

@Repository
public interface PetMapper {

	List<Pet> getPetList(Integer id);

}
