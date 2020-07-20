package com.example.demo.resController;

import com.example.demo.repo.DemoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * In this example, we are performing a for of integration test
 * Observe that we do not initialize the controller, instead, we bring in everything
 * we need since SpringBootTest annotation essentially starts the application context for us
 * and brings in all our controllers
 */
@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest2 {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private DemoService demoService;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void shouldReturnPerson() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/fname/lname"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name", is("fname")));
    }

}
