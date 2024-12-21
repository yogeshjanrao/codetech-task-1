package com.example.Main;

import com.example.Main.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.AbstractMockMvcBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
class MainApplicationTests {

	@Test
	void contextLoads() {
	}

	@Bean
	public HelloWorldService serviceBean(){
		return new HelloWorldService();
	}
}
