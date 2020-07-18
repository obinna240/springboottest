package com.example.demo;

import com.example.demo.repo.DemoService;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    private final DemoService demoService;

    public HomeController(DemoService demoService) {this.demoService = demoService; }


}
