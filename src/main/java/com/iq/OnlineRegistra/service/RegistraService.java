package com.iq.OnlineRegistra.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.iq.OnlineRegistra.dao.RegistraRepository;
import com.iq.OnlineRegistra.entity.Person;

import lombok.RequiredArgsConstructor;

@Service

@RequiredArgsConstructor

public class RegistraService {

	 private RegistraRepository registraRepository;

	    public List<Person> findAll() {
	    	List<Person> list = new ArrayList<Person>();
	    	
	        registraRepository.findAll().forEach(list::add);
	        
	        return list;
	    }

	    public Optional<Person> findById(Long id) {
	        return registraRepository.findById(id);
	    }

	    public Person save(Person person) {
	        return registraRepository.save(person);
	    }

	    public void deleteById(Long id) {
	        registraRepository.deleteById(id);
	    }
}
