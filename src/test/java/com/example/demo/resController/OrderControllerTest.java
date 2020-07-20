package com.example.demo.resController;

import com.example.demo.domain.Person;
import com.example.demo.repo.DemoService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.reset;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class OrderControllerTest {

    @Mock DemoService demoService;
    @InjectMocks OrderController orderController;

    MockMvc mockMvc;
    //additionally we can use @AutoConfigureMockMvc and then mock mockMvc
    //i.e.

    /**
     * @Autowired
     * MockMvc mockmVC
     */

    @BeforeEach
    void init(){
        mockMvc = MockMvcBuilders.standaloneSetup(orderController).build();
    }

    @AfterEach
    void tearDown() {
        reset(demoService);
    }

    @Test
    public void shouldReturnPerson() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/fname/lname"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name", is("fname")));
    }

    @Test
    public void shouldReturnRandom() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/random"))
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnElement() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/element/element"))
                .andExpect(status().isOk());
    }

}