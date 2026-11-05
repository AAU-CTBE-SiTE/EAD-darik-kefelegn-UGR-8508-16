# Spring Core Lab 4 - Annotation-Based Configuration & Dependency Injection

This project demonstrates the transition from XML-based configuration to **Spring Framework's Annotation-Based Configuration** and **Object Dependency Injection** using Spring IoC (Inversion of Control).

## 🚀 Project Overview
* **Spring Version**: 6.2.7
* **Lombok**: 1.18.38
* **Java Version**: 19
* **Configuration Approach**: Annotation-Based (`@Component`, `@Autowired`, `@Scope`) with Component Scanning.

## 📁 Core Components
1. **`Student.java`**: Main bean managed via `@Component`, configured with prototype scope, containing primitive properties and injecting an `Address` object.
2. **`Address.java`**: Secondary bean injected into the `Student` bean to demonstrate **Object Dependency Injection**.
3. **`beansConfig.xml`**: Minimal XML configuration utilizing `<context:component-scan>` to discover annotated beans automatically.
4. **`App.java`**: Launcher class utilizing `ApplicationContext` to load the container and test bean instantiation and injection behavior.

## 🛠️ How to Run
1. Open the project in **IntelliJ IDEA**.
2. Ensure Maven dependencies are downloaded and synced.
3. Run the `main` method in `com.craft.App`.
