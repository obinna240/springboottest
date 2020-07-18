package com.example.demo.resController;

import com.example.demo.domain.Person;
import com.example.demo.repo.DemoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/api/v1")
@RestController
public class OrderController {

    private final DemoService demoService;

    public OrderController(DemoService demoService){this.demoService = demoService;}

    @GetMapping(path = "/random")
    public ResponseEntity<String> getRandomUuid(){
        return new ResponseEntity<>(demoService.retrieveNumber(), HttpStatus.OK);
    }

    @GetMapping(path = "/{element}")
    public ResponseEntity<String> getString(@PathVariable("element") String element){
        return new ResponseEntity<>(demoService.returnEntryMethd(element), HttpStatus.OK);
    }

    @GetMapping(path="/{fname}/{lname}")
    public ResponseEntity<Person> getPerson(@PathVariable("fname") String fname, @PathVariable("lname") String lname) {

        System.out.println(fname);
        System.out.println(lname);
        return new ResponseEntity<Person>(new Person(fname, lname), HttpStatus.OK);
    }

}
