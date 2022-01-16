package com.digitalinovation.personapi.repository;

import com.digitalinovation.personapi.entitty.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
