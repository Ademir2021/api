package br.com.centroinfo.api.api.dto.personDTO;

import br.com.centroinfo.api.api.entity.branch.Branch;
import br.com.centroinfo.api.api.entity.person.Gender;
import br.com.centroinfo.api.api.entity.user.User;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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
    private List<PersonAddressDTO> personAddress;

  
    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Branch getBranch() {
        return this.branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<PersonAddressDTO> getPersonAddress() {
        return this.personAddress;
    }

    public void setPersonAddress(List<PersonAddressDTO> personAddress) {
        this.personAddress = personAddress;
    }
}