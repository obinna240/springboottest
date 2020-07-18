package com.example.demo.repo;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DemoRepository {

    public String printNumber(){return UUID.randomUUID().toString();}

    public String returnEntry(String entry) {return entry+ " "+entry;}

}
