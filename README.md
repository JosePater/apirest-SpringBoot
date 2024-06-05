# API REST Básica con Spring Boot

<p>
    <img src="https://img.shields.io/badge/STATUS-EN PROCESO-yellow">
    <img src="https://img.shields.io/badge/SPRING BOOT-3.3.0-green">
    <img src="https://img.shields.io/badge/DATABASE-MySQL-blue">

</p>

## Descripción

API REST Básica. Está vinculada a una base de datos en MySQL llamada 'apirestdb'.
Cuando se ejecuta la app de Spring Boot se crea una tabla llamada 'person'.

### Datos:

Campos de la tabla 'person' de la base de datos 'apirestdb':

| Entidad Backend  | Campos de la tabla SQL  |
|------------------|-------------------------|
| Long id          | int(11) id PK           |
| String firstName | varchar(255) first_name |
| String lastName  | varchar(255) last_name  |
| String email     | varchar(255) email      |

### Endpoints

| Método | Ruta           | Descripción                                      |
|--------|----------------|--------------------------------------------------|
| GET    | `/persons`     | Obtiene todas las personas de la tabla `person`. |
| GET    | `/person/{id}` | Busca a una persona por su Id.                   |
| POST   | `/add-person`  | Guarda una nueva persona en la base de datos.    |
| PUT    | `/person`      | Modifica los datos de una persona.               |
| DELETE | `/person/{id}` | Elimina a una persona por su Id.                 |

##   

## Desarrollador:

| [<img src="https://avatars.githubusercontent.com/u/120583187?v=4" width=115><br><sub>José Luis Paternina Martínez</sub>](https://github.com/JosePater) 
|:------------------------------------------------------------------------------------------------------------------------------------------------------:| 

