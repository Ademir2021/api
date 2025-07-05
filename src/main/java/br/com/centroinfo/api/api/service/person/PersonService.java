package br.com.centroinfo.api.api.service.person;

import br.com.centroinfo.api.api.dto.addressDTO.AddressDTO;
import br.com.centroinfo.api.api.dto.personDTO.PersonDTO;
import br.com.centroinfo.api.api.dto.personDTO.PersonResponseDTO;
import br.com.centroinfo.api.api.entity.address.Address;
import br.com.centroinfo.api.api.entity.person.Person;
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

    public Person savePerson(PersonDTO personDTO) {
        Person pers = new Person();
        pers.setCreatedAt(LocalDateTime.now());
        pers.setBranch(personDTO.getBranch());
        pers.setUser(personDTO.getUser());
        pers.setName(personDTO.getName());
        pers.setDateOfBirth(personDTO.getDateOfBirth());
        pers.setAge(personDTO.calcAge());
        pers.setGender(personDTO.getGender());
        pers.setCpf(personDTO.getCpf());
        /** Inclui os Address */
        List<Address> addrList = new ArrayList<>();
        for (AddressDTO addressDTO : personDTO.getAddresses()) {
            Address address = new Address();
            address.setId(addressDTO.getId());
            address.setStreet(addressDTO.getStreet());
            address.setNumber(addressDTO.getNumber());
            address.setNeighbor(addressDTO.getNeighbor());
            address.setComplement(addressDTO.getComplement());
            address.setZipCode(addressDTO.getZipCode());
            address.setPerson(addressDTO.getPerson());
            addrList.add(address);
        }
        pers.setAddresses(addrList);
        return personRepository.save(pers);
    }

    public List<Person> list() {
        return personRepository.findAll();
    }

    public List<Person> findSummary() {
        return personRepository.findAll();
    }

    public List<PersonResponseDTO> getPersonsByName(String name) {
        return personRepository.findPersonsByName(name);
    }

    public Person update(PersonDTO personDTO) {
        Person pers = new Person();
        pers.setId(personDTO.getId());
        pers.setCreatedAt(personDTO.getCreatedAt());
        pers.setUpdatedAt(LocalDateTime.now());
        pers.setBranch(personDTO.getBranch());
        pers.setUser(personDTO.getUser());
        pers.setName(personDTO.getName());
        pers.setDateOfBirth(personDTO.getDateOfBirth());
        pers.setAge(personDTO.calcAge());
        pers.setGender(personDTO.getGender());
        pers.setCpf(personDTO.getCpf());
        /** update os Address */
        List<Address> addrList = new ArrayList<>();
        for (AddressDTO addressDTO : personDTO.getAddresses()) {
            Address address = new Address();
            address.setId(addressDTO.getId());
            address.setStreet(addressDTO.getStreet());
            address.setNumber(addressDTO.getNumber());
            address.setNeighbor(addressDTO.getNeighbor());
            address.setComplement(addressDTO.getComplement());
            address.setZipCode(addressDTO.getZipCode());
            address.setPerson(addressDTO.getPerson());
            addrList.add(address);
        }
        pers.setAddresses(addrList);
        return personRepository.save(pers);
    }

    public List<Person> delete(Long id) {
        personRepository.deleteById(id);
        return list();
    }
}
