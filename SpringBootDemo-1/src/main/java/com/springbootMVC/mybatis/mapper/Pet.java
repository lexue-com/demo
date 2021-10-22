package com.springbootMVC.mybatis.mapper;

public class Pet {
	
	private Integer id ;
	private String type;
	private String nickName;
	private Integer age;
	private String color;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Pet(Integer id, String type, String nickName, Integer age, String color) {
		super();
		this.id = id;
		this.type = type;
		this.nickName = nickName;
		this.age = age;
		this.color = color;
	}
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
