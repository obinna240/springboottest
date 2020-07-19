package com.example.demo;

import com.example.demo.repo.DemoService;
import com.example.demo.resController.OrderController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(OrderController.class)
class DemoApplicationTests {

	@MockBean
	DemoService demoService;
	@Autowired
	MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

}
