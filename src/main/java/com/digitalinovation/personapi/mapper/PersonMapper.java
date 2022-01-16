package com.digitalinovation.personapi.mapper;

import com.digitalinovation.personapi.dto.PersonDTO;
import com.digitalinovation.personapi.entitty.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public class PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

//    @Mapping(target = "birthDate", source = "birtDate", dateFormat = "dd-MM-yyyy")
//    Person toModel(PersonDTO personDTO);

//    PersonDTO toDTO(Person person);
}
