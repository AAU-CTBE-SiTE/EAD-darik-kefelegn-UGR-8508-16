package com.craft;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;
import lombok.ToString;
import java.util.List;
import java.util.Arrays;

@Component("student")
@Scope("prototype")
@Data
@ToString
public class Student {
    private int id = 101;
    private String name = "Darik Kefelegn";
    private int age = 20;

    @Autowired
    private Address address;

    private List<Subject> subjects = Arrays.asList(
            new Subject("Java EE"),
            new Subject("Spring Core")
    );
}