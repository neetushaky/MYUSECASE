package com.project.CM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.CM.Entities.Person;
import com.project.CM.Service.ContactService;
@RestController
public class ContactController {
	@Autowired
	private ContactService service;
	@PostMapping("/contact/save")
	public ResponseEntity<Person>addContact(@RequestBody Person person){
		Person addContact = service.addContact(person);
		return ResponseEntity.status(HttpStatus.CREATED).body(addContact);
		
	}
	@GetMapping("/contact/retrieve/{id}")
	public ResponseEntity<Person>getContactDetail(@PathVariable("id") int id){
		Person fromid = service.getFromid(id);
		return ResponseEntity.status(HttpStatus.OK).body(fromid);
		
	}
	@GetMapping("/contact/hello-world")
	public ResponseEntity<String>ContactDetail(){
		
		return ResponseEntity.status(HttpStatus.OK).body("Hello-world");
		
	}

}
