# Spring IoC and Bean Management Lab (Lab 3)

## Student Information
- **Name:** Darik Kefelegn
- **Student ID:** UGR-8508-16
- **Institution:** Addis Ababa University (AAU)
- **School:** School of Information Technology and Engineering (SiTE)
- **Course:** Enterprise Application Development (EAD)

## Project Overview
This project demonstrates the core concepts of the **Spring Inversion of Control (IoC)** container and XML-based bean configuration using Spring Framework 6.1.5. It configures a POJO (`Student`) via setter-based dependency injection inside an XML configuration file (`beansConfig.xml`) and retrieves it through `ClassPathXmlApplicationContext`.

## Technology Stack
- **Language:** Java 17 / 21
- **Framework:** Spring Framework (Version 6.1.5)
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA Community Edition

## Project Structure
```text
spring-ioc/
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── craft
    │   │           └── spring_ioc
    │   │               ├── Main.java
    │   │               └── Student.java
    │   └── resources
    │       └── beansConfig.xml
    └── test
