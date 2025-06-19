package br.com.centroinfo.api.api.controller.personcontroller;

import br.com.centroinfo.api.api.dto.personDTO.PersonDTO;
import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.service.person.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/persons")
    public List<Person> create(@RequestBody PersonDTO personDTO) {
        personService.create(personDTO);
        return list();
    }

    @GetMapping("/persons")
    public List<Person> list() {
        return personService.list();
    }

    @PutMapping("/persons")
    public List<Person> update(@RequestBody PersonDTO personDTO) {
        personService.update(personDTO);
        return list();
    }

  
   @DeleteMapping("/persons/{id}")
   public List<Person> delete(@PathVariable("id") Long id){
    return personService.delete(id);
   }

}
