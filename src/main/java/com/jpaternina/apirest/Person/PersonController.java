package com.jpaternina.apirest.Person;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* Esta clase (Controlador) publica los endpoints (rutas) para disposición a los clientes
 * o para acceder a alguna funcionalidad
 */

@Controller // Controlador
@RestController
@RequestMapping
@RequiredArgsConstructor // Crea el constructor
public class PersonController {

    private final PersonService personService; // Inyección del servicio

    // Agregar nueva persona
    @PostMapping("/add-person")  // POST: (indica que viene del Body)
    public void createPersona(@RequestBody Person person) {
        personService.createPersona(person);
    }

    // Obtener todas las personas
    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personService.getAllPersons();
    }

    // Buscar persona por su id
    @GetMapping("/person/{id}")
    @ResponseBody
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    // Eliminar persona (id)
    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }

    // Modificar persona
    @PutMapping("/person")
    public void updatePerson(@RequestBody Person person) {
        personService.updatePerson(person);
    }

}
