package com.craft.spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");
        Student student = (Student) context.getBean("student");
        student.getDetails();
        System.out.println("Student Name: " + student.getName());
    }
}