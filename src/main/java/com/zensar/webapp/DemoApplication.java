package com.zensar.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//on which class @sprinBootApplication is written then that package and it subpackages get scanned only means com.zensar.webapp and it subclasses
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
