package com.example.samplewebproj.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class HelloWorldControllerTest {

	
	HelloWorldController hwc = new HelloWorldController();
	
	@Test
	public void checkHelloUnit() throws Exception{
		
		String response = hwc.hello();
		assertEquals("Web App 1", response);
		
		
	}
	
	
}
