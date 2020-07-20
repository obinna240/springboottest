package com.example.demo.mvcController;

import com.example.demo.domain.Person;
import com.example.demo.repo.DemoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apps")
public class PageController {
    private final DemoService demoService;

    public PageController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/sample")
    public String runApp(){
        return "This is a running test";
    }

    @GetMapping("/random")
    public String runApp2() {
        return demoService.retrieveNumber();
    }

    @GetMapping(path="/names/{fname}/{lname}")
    public Person getPerson(@PathVariable("fname") String fname, @PathVariable("lname") String lname) {
        return new Person(fname, lname);
    }

}
