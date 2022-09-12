package com.project.CM.DAO;

import org.springframework.data.repository.CrudRepository;

import com.project.CM.Entities.Person;

public interface ContactRepository extends CrudRepository<Person, Integer> {

}
