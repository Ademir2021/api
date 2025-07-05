package br.com.centroinfo.api.api.dto.addressDTO;

import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.entity.zipcode.ZipCode;
import lombok.Getter;

@Getter
public class AddressDTO {
    private Long id;
    private String street;
    private String number;
    private String neighbor;
    private String complement;
    private ZipCode zipCode;
    private Person person;
}