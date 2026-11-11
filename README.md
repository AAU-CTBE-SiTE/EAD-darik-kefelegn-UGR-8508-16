# Actor Management System - Spring Boot CRUD Lab

A Spring Boot RESTful API application developed for the Enterprise Application Development (EAD) course lab. This project implements full **CRUD** (Create, Read, Update, Delete) operations using an in-memory `ArrayList` data structure[cite: 4, 5].

##  Tech Stack & Requirements
* **Java**: 17+
* **Framework**: Spring Boot (Maven)
* **Starter Dependencies**: Spring Web (`spring-boot-starter-web`)
* **Data Persistence**: In-memory `java.util.List` / `ArrayList`[cite: 4, 5]

---

## API Endpoints & Usage

Base URL: `http://localhost:8080/api/v1`[cite: 4]

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **GET** | `/actor` | Retrieve a list of all actors[cite: 4] |
| **GET** | `/actor/{id}` | Retrieve a specific actor by their ID[cite: 5] |
| **POST** | `/actor` | Add a new actor (expects JSON body) |
| **PUT** | `/actor/{id}` | Update an existing actor by ID |
| **DELETE** | `/actor/{id}` | Delete an actor by ID[cite: 6, 7] |

---

##  Project Structure
```text
actor-management/
│
├── src/main/java/com/site/actor_manager/
│   ├── ActorManagementApplication.java
│   ├── controller/
│   │   └── ActorController.java
│   └── model/
│       └── Actor.java
│
├── pom.xml
└── README.md
