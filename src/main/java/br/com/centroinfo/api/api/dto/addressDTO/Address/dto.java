package br.com.centroinfo.api.api.dto.addressDTO.Address;

import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.entity.zipcode.ZipCode;

public class dto {
    public Long id;
    public String street;
    public String number;
    public String neighbor;
    public String complement;
    public ZipCode zipCode;
    public Person person;
}
