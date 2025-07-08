package br.com.centroinfo.api.api.dto.personDTO;

// import br.com.centroinfo.api.api.dto.addressDTO.AddressDTO;
import br.com.centroinfo.api.api.entity.branch.Branch;
import br.com.centroinfo.api.api.entity.person.Gender;
import br.com.centroinfo.api.api.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
// import java.util.List;

@Getter
@Setter
public class PersonDTO {
    private Long id;
    private LocalDateTime createdAt;
    private Branch branch;
    private User user;
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String cpf;
    // private List<AddressDTO> addresses;
    public int calcAge() {
    return LocalDate.now().getYear() - dateOfBirth.getYear();
  }
}