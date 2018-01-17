package com.dengpu.barbershop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.dengpu.barbershop.dao")
public class BarbershopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarbershopApplication.class, args);
	}

}
