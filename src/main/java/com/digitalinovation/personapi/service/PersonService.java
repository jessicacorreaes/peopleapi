package com.digitalinovation.personapi.service;

import com.digitalinovation.personapi.dto.MessageResponseDTO;
import com.digitalinovation.personapi.dto.PersonDTO;
import com.digitalinovation.personapi.entitty.Person;
import com.digitalinovation.personapi.mapper.PersonMapper;
import com.digitalinovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

//    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


//    public MessageResponseDTO createPerson (PersonDTO personDTO){
//        Person personToSave = personMapper.toModel(personDTO);
//
//
//        Person savedPerson = personRepository.save(personToSave);
//        return MessageResponseDTO
//                .builder()
//                .message("Created person with ID" + savedPerson.getId())
//                .build();
//    }
}