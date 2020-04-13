package com.iq.OnlineRegistra.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iq.OnlineRegistra.entity.Person;
import com.iq.OnlineRegistra.service.RegistraService;

import lombok.RequiredArgsConstructor;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor

public class RegistraController {
	
    private RegistraService registraService;

    @RequestMapping("/users")
    public ResponseEntity<List<Person>> findAll() {
        return ResponseEntity.ok(registraService.findAll());
    }

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public ResponseEntity create(@Valid @RequestBody Person person) {
        return ResponseEntity.ok(registraService.save(person));
    }


}
