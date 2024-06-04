package com.jpaternina.apirest.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Mediante JPA se pueden generar métodos para CRUD

@Repository // Repository                           <Entidad, type primary key entity>
public interface PersonRepository extends JpaRepository<Person, Long> {

}
