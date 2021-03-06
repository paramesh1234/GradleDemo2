package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Demo2Application {

	@ResponseBody
	@RequestMapping({"/","/hello"})
	public String hello(){
		return "Hello Parameshwar Redddy";
	}

	public void know(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
