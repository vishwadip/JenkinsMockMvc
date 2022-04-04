package com.zensar.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.zensar.webapp.rest.controller.HelloRestController;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloRestControllerTest {

	@Autowired//to enable autowiring for mockMvc test class must be annotated with @AutoConfigureMockMvc
	private MockMvc mock; //MockMvc is a class given by spring mvc to perform testing of spring controller
	
	@Test
	public void getMessageTest() throws Exception {
		mock
		.perform(MockMvcRequestBuilders.get("/getMessage"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("HelloWorld"));
	}

	@Test
	public void createMessageTest() throws Exception {
		
		HelloRestController helloRestController;
		
		mock
		.perform(MockMvcRequestBuilders.post("/greet").content("Hello"))
		.andExpect(MockMvcResultMatchers.status().isCreated())
		.andExpect(MockMvcResultMatchers.content().string("Hello"));
	}
	
	

}
