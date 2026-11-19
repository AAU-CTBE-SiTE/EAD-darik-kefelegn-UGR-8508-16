# Student Management RESTful API

Spring Boot RESTful CRUD API for managing students (`Student`), built with Spring Web, Spring Data JPA, MySQL, and Lombok.

## Tech Stack
- **Java:** 21
- **Framework:** Spring Boot 3.5.16
- **Database:** MySQL (`student_db`)
- **Build Tool:** Maven

## API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/students` | Create a new student |
| `GET` | `/api/students` | Retrieve all students |
| `GET` | `/api/students/{id}` | Retrieve a student by ID |
| `PUT` | `/api/students/{id}` | Update an existing student by ID |
| `DELETE` | `/api/students/{id}` | Delete a student by ID |

## AI Interaction History
- [ChatGPT Conversation 1 – Project Setup & Implementation](https://chatgpt.com/share/6afead81-9aac-83ea-8e05-a858bb477083)
- [ChatGPT Conversation 2 – Testing & Troubleshooting](https://chatgpt.com/share/6afeadaa-39e4-83e9-aed5-973f633e1ab9)