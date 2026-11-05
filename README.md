Java Persistence API (JPA) & ORM Lab (Lab 2)
Student Information
Name: Darik Kefelegn

Student ID: UGR-8508-16

Institution: Addis Ababa University (AAU)

School: School of Information Technology and Engineering (SiTE)

Course: Enterprise Application Development (EAD)

Project Overview
This repository contains the implementation of Lab 2: Object-Relational Mapping (ORM) using Java Persistence API (JPA). The project focuses on mapping Java domain entities to relational database tables, managing persistence contexts, and performing database operations using standard JPA annotations and entity manager configurations.

Technology Stack
Language: Java 17 / 21

Persistence API: Jakarta Persistence API (JPA) / Hibernate ORM

Database: MySQL

Build Tool: Maven

IDE: IntelliJ IDEA Community Edition

Key Implementation Features
Entity Annotations: Configured domain models using @Entity, @Id, @GeneratedValue, and @Column annotations.

Persistence Unit: Configured database connection settings, dialect, and driver properties inside src/main/resources/META-INF/persistence.xml.

Transaction Management: Implemented object lifecycle management (persist, find, merge, remove) wrapped inside EntityTransaction blocks (begin(), commit()).

How to Run
Ensure your local database server (e.g., MySQL) is running.

Update database credentials in src/main/resources/META-INF/persistence.xml if needed.

Open the project in IntelliJ IDEA and allow Maven to load dependencies.

Execute the main driver class to run the JPA operations.
