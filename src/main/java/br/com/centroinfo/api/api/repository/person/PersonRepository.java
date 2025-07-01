package br.com.centroinfo.api.api.repository.person;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.centroinfo.api.api.dto.personDTO.PersonDTOSumary;
import br.com.centroinfo.api.api.entity.person.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
        
        @Query("""
        SELECT NEW br.com.centroinfo.api.api.dto.personDTO.PersonDTOSumary(
        p.id, p.createdAt, p.name, p.age, dateOfBirth, p.cpf,
        b.id, b.name,
        u.id, u.login,
        pa.id
        )
        FROM Person p
        JOIN p.branch b
        JOIN p.user u
        JOIN p.personAddress pa
        """)
        List<PersonDTOSumary> findSummary();
}
