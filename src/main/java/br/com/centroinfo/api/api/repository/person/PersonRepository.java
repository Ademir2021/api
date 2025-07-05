package br.com.centroinfo.api.api.repository.person;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.centroinfo.api.api.dto.personDTO.PersonResponseDTO;
import br.com.centroinfo.api.api.entity.person.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query("SELECT new br.com.centroinfo.api.api.dto.personDTO.PersonResponseDTO(p.id, p.createdAt, p.name, p.age, p.dateOfBirth, p.cpf, "
            +"b.id, b.name, u.id, u.login, p.gender) " +
            "FROM Person p " +
            "JOIN p.branch b " +
            "JOIN p.user u " +
            "" + "WHERE p.name LIKE %:name%")
    List<PersonResponseDTO> findPersonsByName(@Param("name") String name);
}
