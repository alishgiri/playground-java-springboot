package com.playground.playground.dao;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

import com.playground.playground.model.Person;

public interface PersonDao {

    int insertPerson(UUID uuid, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);

}
