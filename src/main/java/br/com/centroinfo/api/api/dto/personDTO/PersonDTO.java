package br.com.centroinfo.api.api.dto.personDTO;

import java.time.LocalDate;
import java.util.List;

import br.com.centroinfo.api.api.entity.person.Gender;

public class PersonDTO {
    public Long id;
    public String name;
    public int age;
    public LocalDate dateOfBirth;
    public Gender gender;
    public String cpf;
    public List<PersonAddressDTO> personAddress;
}
