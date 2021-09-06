package com.example.samplewebproj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContoller {
	
	@RequestMapping("/hello")  
	public String hello()   
	{  
		return "Hello Jafar V2";  
	}

}
