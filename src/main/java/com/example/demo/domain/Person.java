package com.example.demo.domain;

public class Person {

    private final String name;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    private final String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

}
