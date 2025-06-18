package br.com.centroinfo.api.api.controller.personcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.centroinfo.api.api.dto.personDTO.PersonDTO;
import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.service.person.PersonService;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/persons")
    public List<Person> create(@RequestBody PersonDTO personDTO){
        personService.create(personDTO);
        return list();
    }

    @GetMapping("/persons")
    public List<Person> list(){
        return personService.list();
    }
}
