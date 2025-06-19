package br.com.centroinfo.api.api.entity.address;

import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.entity.zipcode.ZipCode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name="address")
@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String number;

    private String neighbor;

    private String complement;

    @ManyToOne
    @JoinColumn(name = "zipcode_id")
    private ZipCode zipCode;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
