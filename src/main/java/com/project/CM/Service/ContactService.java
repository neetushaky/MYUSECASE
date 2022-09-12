package com.project.CM.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.CM.DAO.ContactRepository;
import com.project.CM.Entities.Person;
@Service
public class ContactService {
	@Autowired
	private ContactRepository repo;
	
	public Person addContact(Person person) {
		Person save = this.repo.save(person);
		return save;
		
	}
	
	public Person getFromid(int id) {
		Optional<Person> ById = this.repo.findById(id);
		Person person1 = ById.get();
		return person1;
		
	}
	

}
