package com.example.demo.repo;

import com.example.demo.domain.Person;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private final DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository){this.demoRepository = demoRepository;}

    public String retrieveNumber(){return demoRepository.printNumber();}

    public String returnEntryMethd(String test){
        return demoRepository.returnEntry(test);
    }

    public Person createPerson(String fname, String lname){
        return new Person(fname, lname);
    }
}
