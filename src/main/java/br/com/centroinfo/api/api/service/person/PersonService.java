package br.com.centroinfo.api.api.service.person;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.centroinfo.api.api.dto.personDTO.PersonAddressDTO;
import br.com.centroinfo.api.api.dto.personDTO.PersonDTO;
import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.entity.person.PersonAddress;
import br.com.centroinfo.api.api.repository.person.PersonRepository;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person create(PersonDTO personDTO) {
        Person person = new Person();
        person.setId(personDTO.id);
        person.setName(personDTO.name);
        person.setDateOfBirth(personDTO.dateOfBirth);
        person.setAge(person.calcAge());
        person.setGender(personDTO.gender);
        person.setCpf(personDTO.cpf);

        List<PersonAddress> addressList = new ArrayList<>();
        for (PersonAddressDTO personAddressDTO : personDTO.personAddress) {
            PersonAddress personAddress = new PersonAddress();
            personAddress.setIdAddress(personAddressDTO.idAddrees);
            personAddress.setPerson(person);
            addressList.add(personAddress);
        }
        person.setPersonAddress(addressList);
        return personRepository.save(person);
    }

    public List<Person> list() {
        return personRepository.findAll();
    }
}
