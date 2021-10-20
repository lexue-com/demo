package com.springbootMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.springDataJpa"})
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}

}
