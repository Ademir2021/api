package br.com.centroinfo.api.api.service.person;

import br.com.centroinfo.api.api.dto.personDTO.PersonAddressDTO;
import br.com.centroinfo.api.api.dto.personDTO.PersonDTO;
import br.com.centroinfo.api.api.dto.personDTO.PersonDTOSumary;
import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.entity.person.PersonAddress;
import br.com.centroinfo.api.api.repository.person.PersonRepository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person create(PersonDTO personDTO) {
        Person person = new Person();
        person.setCreatedAt(LocalDateTime.now());
        person.setBranch(personDTO.getBranch());
        person.setUser(personDTO.getUser());
        person.setName(personDTO.getName());
        person.setDateOfBirth(personDTO.getDateOfBirth());
        person.setAge(person.calcAge());
        person.setGender(personDTO.getGender());
        person.setCpf(personDTO.getCpf());

        List<PersonAddress> addressList = new ArrayList<>();
        for (PersonAddressDTO personAddressDTO : personDTO.getPersonAddress()) {
            PersonAddress personAddress = new PersonAddress();
            personAddress.setIdAddress(personAddressDTO.getIdAddrees());
            personAddress.setPerson(person);
            addressList.add(personAddress);
        }
        person.setPersonAddress(addressList);
        return personRepository.save(person);
    }

    public List<Person> list() {
        return personRepository.findAll();
    }

    public List<PersonDTOSumary> findSummary(){
        return personRepository.findSummary();
    }

    public Person update(PersonDTO personDTO) {
        Person person = new Person();
        person.setId(personDTO.getId());
        person.setCreatedAt(personDTO.getCreatedAt());
        person.setUpdatedAt(LocalDateTime.now());
        person.setBranch(personDTO.getBranch());
        person.setUser(personDTO.getUser());
        person.setName(personDTO.getName());
        person.setDateOfBirth(personDTO.getDateOfBirth());
        person.setAge(person.calcAge());
        person.setGender(personDTO.getGender());
        person.setCpf(personDTO.getCpf());

        List<PersonAddress> addressList = new ArrayList<>();
        for (PersonAddressDTO personAddressDTO : personDTO.getPersonAddress()) {
            PersonAddress personAddress = new PersonAddress();
            personAddress.setIdAddress(personAddressDTO.getIdAddrees());
            personAddress.setPerson(person);
            addressList.add(personAddress);
        }
        person.setPersonAddress(addressList);
        return personRepository.save(person);
    }

    public List<Person> delete(Long id) {
        personRepository.deleteById(id);
        return list();
    }
}
