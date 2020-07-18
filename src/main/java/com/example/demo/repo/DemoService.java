package com.example.demo.repo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private final DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository){this.demoRepository = demoRepository;}

    public String retrieveNumber(){return demoRepository.printNumber();}

    public String returnEntryMethd(String test){return demoRepository.returnEntry(test);}
}
