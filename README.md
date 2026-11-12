# Aspect-Oriented Programming (AOP) - Spring Boot Lab (Lab 6)

A comprehensive Spring Boot application developed for the Enterprise Application Development (EAD) course lab to demonstrate **Aspect-Oriented Programming (AOP)** principles, implementing all major Spring AOP and AspectJ annotations, pointcuts, and advice types.

## Overview & Key Concepts Covered

This project cleanly separates cross-cutting concerns (such as logging, exception interception, and performance benchmarking) from core business logic using Spring AOP. 

The implementation covers **every major concept of AOP**:
* **Aspect (`@Aspect` & `@Component`)**: Encapsulates the cross-cutting logging behaviors.
* **Pointcut (`@Pointcut`)**: A reusable expression targeting the service layer.
* **JoinPoint & ProceedingJoinPoint**: Inspects method signatures, input arguments, and controls execution flow.
* **The 5 Core Advice Types**:
  1. **`@Before`**: Executes logic prior to method invocation.
  2. **`@AfterReturning`**: Captures successful return values.
  3. **`@AfterThrowing`**: Intercepts and logs thrown exceptions (e.g., division by zero).
  4. **`@After` (Finally)**: Guarantees execution cleanup regardless of success or failure.
  5. **`@Around`**: Wraps method execution to measure precise runtime performance in milliseconds.

---

## Tech Stack & Dependencies

* **Java**: 21
* **Framework**: Spring Boot (Maven)
* **AOP Starter**: `spring-boot-starter-aop`

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
