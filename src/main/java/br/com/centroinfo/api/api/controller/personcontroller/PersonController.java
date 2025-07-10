package br.com.centroinfo.api.api.controller.personcontroller;

import br.com.centroinfo.api.api.dto.personDTO.PersonDTO;
import br.com.centroinfo.api.api.dto.personDTO.PersonResponseDTO;
import br.com.centroinfo.api.api.entity.person.Person;
import br.com.centroinfo.api.api.service.person.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/persons")
    public Person create(@RequestBody PersonDTO personDTO) {
            return personService.savePerson(personDTO);
    }

    @GetMapping("/persons")
    public List<Person> list() {
        return personService.findSummary();
    }
    @GetMapping("/search")
    public List<PersonResponseDTO> searchPersons(@RequestParam String name) {
        return personService.getPersonsByName(name);
    }

    @PutMapping("/persons")
    public ResponseEntity<String> update(@RequestBody PersonDTO personDTO) {
        try {
            Person person = personService.update(personDTO);
            return ResponseEntity.ok().body("Pessoa atualizada com sucesso " + person.getId());
        } catch (Exception e) {
            return ResponseEntity.ok().body("Erro ao atualizar Pessoa " + e);
        }
    }

    @DeleteMapping("/persons/{id}")
    public List<Person> delete(@PathVariable("id") Long id) {
        return personService.delete(id);
    }

}
