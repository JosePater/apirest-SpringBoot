package com.jpaternina.apirest.Person;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // Lombok
@AllArgsConstructor // Constructor con todos los argumentos
@NoArgsConstructor  // Constructor sin argumentos
@Entity // Entidad
public class Person {
    @Id // Identificador
    @GeneratedValue()
    private Integer id;
    @Basic // Campos básicos
    private String firstName;
    private String lastName;
    private String email;
}
