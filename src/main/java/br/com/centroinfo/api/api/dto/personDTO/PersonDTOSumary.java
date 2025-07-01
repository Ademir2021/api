package br.com.centroinfo.api.api.dto.personDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.centroinfo.api.api.entity.person.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTOSumary {
    private Long id;
    private LocalDateTime createdAt;
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String cpf;
    private BranchSumaryDTO branch;
    private UserSumaryDTO user;
    private PersonAddressDTO personAddress;

    public PersonDTOSumary(
        Long id,
        LocalDateTime createdAt,
        String name,
        int age,
        LocalDate dateOfBirth,
        String cpf,
        Long bId,
        String bName,
        Long uId,
        String uLogin,
        Long perAddrId,
        Gender gender
        ) {
        this.id = id;
        this.createdAt = createdAt;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cpf = cpf;
        this.branch = new BranchSumaryDTO(bId, bName);
        this.user = new UserSumaryDTO(uId, uLogin);
        this.personAddress = new PersonAddressDTO(perAddrId);
        this.gender = gender;
    }
}

