package br.com.centroinfo.api.api.dto.addressDTO;

import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.entity.zipcode.ZipCode;

public class AddressDTO {
    private Long id;
    private String street;
    private String number;
    private String neighbor;
    private String complement;
    private ZipCode zipCode;
    private Person person;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNeighbor() {
        return this.neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getComplement() {
        return this.complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public ZipCode getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}