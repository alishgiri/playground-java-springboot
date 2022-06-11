package com.playground.playground.dao;

import java.util.List;
import java.util.UUID;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.playground.playground.model.Person;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID uuid, Person person) {
        DB.add(new Person(uuid, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person perosn) {
        return 0;
    }

}
