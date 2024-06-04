package com.jpaternina.apirest.Person;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // Lombok
@Entity // Entidad
@AllArgsConstructor // Constructor con todos los argumentos
@NoArgsConstructor  // Constructor sin argumentos
public class Person {
    @Id // Identificador
    private Long id;
    @Basic // Campos básicos
    private String firstName;
    private String lastName;
    private String email;
}
