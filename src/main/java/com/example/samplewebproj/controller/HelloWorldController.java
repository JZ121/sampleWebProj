package com.example.samplewebproj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")  
	public String hello()   
	{  
		return "Web App 1";  
	}

}
