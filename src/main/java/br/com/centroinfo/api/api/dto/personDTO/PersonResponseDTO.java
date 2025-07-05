package br.com.centroinfo.api.api.dto.personDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.centroinfo.api.api.entity.person.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonResponseDTO {
    private Long id;
    private LocalDateTime createdAt;
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String cpf;
    private BranchResponseDTO branch;
    private UserResponseDTO user;

    public PersonResponseDTO(
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
            Gender gender) {
        this.id = id;
        this.createdAt = createdAt;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cpf = cpf;
        this.branch = new BranchResponseDTO(bId, bName);
        this.user = new UserResponseDTO(uId, uLogin);
        this.gender = gender;
    };
    /**User */
    @Getter
    @Setter
    public class UserResponseDTO {
        private Long id;
        private String login;

        public UserResponseDTO(Long id, String login) {
            this.id = id;
            this.login = login;
        }
    };
    /**Branch */
    @Getter
    @Setter
    public class BranchResponseDTO {
        private Long id;
        private String name;

        public BranchResponseDTO(Long id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
