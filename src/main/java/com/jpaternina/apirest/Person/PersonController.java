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

    @PostMapping("/add-person")  // POST: (indica que viene del Body)
    public void createPersona(@RequestBody Person person) {
        personService.createPersona(person);
    }

    @GetMapping("/persons")
    public List<Person> getPerson() {
        return personService.getAllPersons();
    }

}
