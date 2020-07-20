package com.example.demo.mvcController;

import com.example.demo.repo.DemoService;
import com.example.demo.resController.OrderController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PageController.class)
class PageControllerTest {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    private DemoService demoService;

    @Test
    void runApp() throws Exception{
        mockMvc.perform(get("/apps/sample"))
                .andExpect(status().isOk());
    }

    @Test
    void runRandomTest() throws Exception {
        mockMvc.perform(get("/apps/random"))
                .andExpect(status().isOk());
    }

    @Test
    void getPerson() throws Exception {
        mockMvc.perform(get("/apps/names/fname/lname"))
                .andExpect(status().isOk());
    }
}




