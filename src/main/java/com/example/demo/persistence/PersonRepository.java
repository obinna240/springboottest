package com.example.demo.persistence;

import com.example.demo.domain.PersonEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends CrudRepository<PersonEntity, Long> {

    PersonEntity findPersonEntityByName(String name);

    @Query(value = "select * from personentity as person where person.name = :name", nativeQuery = true)
    PersonEntity findPersonEntityUsingNativeQuery(@Param("name") String name);
}
