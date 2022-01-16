package com.digitalinovation.personapi.controller;


import com.digitalinovation.personapi.dto.MessageResponseDTO;
import com.digitalinovation.personapi.dto.PersonDTO;
import com.digitalinovation.personapi.entitty.Person;
import com.digitalinovation.personapi.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {]
//        return personService.createPerson(personDTO);
//    }
}

