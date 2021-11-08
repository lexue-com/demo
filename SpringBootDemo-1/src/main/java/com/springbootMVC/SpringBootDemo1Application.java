package com.springbootMVC;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
//如果使用@ComponentScan注解：
//@ComponentScan(basePackages = "com.be.fallback")

//如果使用@SpringBootApplication注解：
//@SpringBootApplication(scanBasePackages = "com.springbootMVC")
@EnableAutoConfiguration
@MapperScan(basePackages = "com.springbootMVC.oa.mapper")
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}

}
