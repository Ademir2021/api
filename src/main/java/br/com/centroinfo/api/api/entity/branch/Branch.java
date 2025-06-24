package br.com.centroinfo.api.api.entity.branch;

import br.com.centroinfo.api.api.entity.person.Person;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "branchs")
@Entity
@Getter
@Setter
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "fantasy_name")
    private String fantasyName;
    private String address;
    @Column(name="phone_number")
    private String phoneNumber;
    private String license;
    @ManyToOne
    @JoinColumn(name="person_id")
    private Person person;
}