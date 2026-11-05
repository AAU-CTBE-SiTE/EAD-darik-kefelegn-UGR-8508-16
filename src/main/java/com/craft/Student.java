package com.craft;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;
import lombok.ToString;
import java.util.List;

@Component("student")
@Data
@ToString
public class Student {
    private int id = 101;
    private String name = "Darik Kefelegn";
    private int age = 20;

    @Autowired // Object Injection (Address)
    private Address address;

    private List<Subject> subjects; // List of Beans Injection
}

