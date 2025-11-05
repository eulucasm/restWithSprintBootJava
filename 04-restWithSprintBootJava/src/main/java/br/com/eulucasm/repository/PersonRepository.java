package br.com.eulucasm.repository;

import br.com.eulucasm.data.dto.PersonDTO;
import br.com.eulucasm.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
