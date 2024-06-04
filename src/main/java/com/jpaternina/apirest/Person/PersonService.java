package com.jpaternina.apirest.Person;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/* Esta clase (Servicio) provee los servicios al controlador, el cual publica
 *  los endpoints o rutas para que sean consumidas. Para así manipular la tabla person
 */

@Service // Servicio
@RequiredArgsConstructor // Crea el constructor
public class PersonService {

    // Inyección del repositorio: se genera al momento de crear el constructor | También con @Autowired
    private final PersonRepository personRepo;

    // Guardar nueva persona
    public void createPersona(Person person) {
        System.out.println("person: "+person);
        // .save(): permite crear como modificar
        personRepo.save(person);
    }

    // Obtener todas las personas
    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }


    // Pendiente crear métodos para buscar una persona por su id, eliminar y actualizar
}
