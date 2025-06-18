package br.com.centroinfo.api.api.entity.person;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Table(name="persons")
@Entity
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    @Column(name = "date_birth")
    private LocalDate dateOfBirth;

    private Gender gender;

    private String cpf;

      @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<PersonAddress> personAddress;

    public int calcAge() {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

}
