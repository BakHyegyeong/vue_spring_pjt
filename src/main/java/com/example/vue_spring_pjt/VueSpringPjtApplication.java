package com.example.vue_spring_pjt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.vue_spring_pjt.work.mapper")
public class VueSpringPjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueSpringPjtApplication.class, args);
	}

}
