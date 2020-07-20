package com.example.demo.persistence;

import com.example.demo.domain.PersonEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;

    @BeforeEach
    void init(){
        personRepository.save(new PersonEntity("John", "Landl"));
    }

    @Test
    void findPersonEntityByName() {
        PersonEntity pp = personRepository.findPersonEntityByName("John");
        assertThat(pp.getName()).isEqualTo("John");
    }

    @Test
    void findPersonEntityUsingNativeQuery() {
        PersonEntity pp = personRepository.findPersonEntityUsingNativeQuery("John");
        assertThat(pp.getName()).isEqualTo("John");
    }
}