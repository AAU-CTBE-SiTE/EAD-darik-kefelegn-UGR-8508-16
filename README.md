# Actor Management CRUD Application - Spring Boot Lab (Lab 7)

A Spring Boot RESTful application developed for the Enterprise Application Development (EAD) course lab to demonstrate **CRUD operations (Create, Read, Update, Delete)** integrated with a **MySQL database** using **Spring Data JPA** and **Spring Web**.

##  Overview & Key Features

This project migrates an in-memory/basic CRUD architecture to a persistent relational database backend. 

Key concepts implemented:
* **Spring Web (`@RestController`, `@GetMapping`, `@PostMapping`, `@DeleteMapping`)**: Exposes clean REST endpoints for managing actors.
* **Spring Data JPA & Hibernate (`JpaRepository`)**: Handles automated database table creation, entity mapping, and persistence layer operations without writing explicit SQL.
* **MySQL Database Integration**: Stores persistent actor records (`id`, `name`, `movie_name`) using Connector/J.

---

## Tech Stack & Dependencies

* **Java**: 21
* **Framework**: Spring Boot (Maven)
* **Database**: MySQL Server (`actor_db`)
* **Core Starters**: 
  * `spring-boot-starter-web`
  * `spring-boot-starter-data-jpa`
  * `mysql-connector-j`

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>
