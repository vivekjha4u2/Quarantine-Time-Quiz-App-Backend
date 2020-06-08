package com.qtime.application;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.qtime.controller")
@SpringBootApplication
public class QTimeWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QTimeWsApplication.class, args);
		System.out.println("main");
	}

}
