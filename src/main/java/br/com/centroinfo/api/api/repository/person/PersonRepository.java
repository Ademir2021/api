package br.com.centroinfo.api.api.repository.person;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.centroinfo.api.api.entity.person.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}
