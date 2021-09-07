package com.example.samplewebproj.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
public class HelloWorldControllerTest {

//	@Autowired
//	private MockMvc mockMvc;
	
	HelloWorldController hwc = new HelloWorldController();
	
	@Test
	public void checkHelloUnit() throws Exception{
		
//		mvc.perform(MockMvcRequestBuilders.get("/hello").contentType(MediaType.APPLICATION_JSON))
//		.andExpect(status().isOk())
//		.andExpect(content().string(equalTo("Hello Jafar V5")));
		
//		this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk())
//		.andExpect(content().string(containsString("Hello Jafar V5")));
		String response = hwc.hello();
		assertEquals("Hello Jafar v5", response);
		
		
	}
	
	
}
