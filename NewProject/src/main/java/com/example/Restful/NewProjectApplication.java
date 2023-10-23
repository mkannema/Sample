package com.example.Restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewProjectApplication {
String abc(){
	return "hello";
}
	public static void main(String[] args) {
		SpringApplication.run(NewProjectApplication.class, args);
	}

}
