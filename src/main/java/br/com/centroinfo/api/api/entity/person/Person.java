package br.com.centroinfo.api.api.entity.person;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import br.com.centroinfo.api.api.entity.branch.Branch;
import br.com.centroinfo.api.api.entity.user.User;
import lombok.Getter;
import lombok.Setter;

@Table(name = "persons")
@Entity
@Getter
@Setter
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  @ManyToOne
  @JoinColumn(name = "branch_id")
  private Branch branch;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  
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
