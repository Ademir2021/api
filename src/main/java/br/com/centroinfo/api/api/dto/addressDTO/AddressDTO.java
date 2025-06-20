package br.com.centroinfo.api.api.dto.addressDTO;

import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.entity.zipcode.ZipCode;

public class AddressDTO {
    public Long id;
    public String street;
    public String number;
    public String neighbor;
    public String complement;
    public ZipCode zipCode;
    public Person person;
}
