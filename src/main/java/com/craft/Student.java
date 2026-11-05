package com.craft;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;
import lombok.ToString;

@Component("student") // Registers this class as a Spring bean named "student"
@Scope("prototype")   // Sets the scope (change to "singleton" if testing singleton)
@Data
@ToString
public class Student {
    private int id = 101;
    private String name = "Darik Kefelegn";
    private int age = 20;

    @Autowired(required = false) // Automatically injects the Address bean if available
    private Address address;

    public Student() {
        System.out.println("Student Bean Created via Annotation!");
    }
}

