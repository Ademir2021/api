package br.com.centroinfo.api.api.dto.personDTO;

import br.com.centroinfo.api.api.entity.branch.Branch;
import br.com.centroinfo.api.api.entity.person.Gender;
import br.com.centroinfo.api.api.entity.user.User;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class PersonDTO {
    public Long id;
    public LocalDateTime createdAt;
    public Branch branch;
    public User user;
    public String name;
    public int age;
    public LocalDate dateOfBirth;
    public Gender gender;
    public String cpf;
    public List<PersonAddressDTO> personAddress;
}
