package com.feri.bootssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //注解 标记SpringBoot项目的开关类
@MapperScan("com.feri.bootssm.dao") //Mybatis的dao层扫描
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
