package com.craft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");

        // Request the bean twice
        Student student1 = context.getBean("student", Student.class);
        Student student2 = context.getBean("student", Student.class);

        // Check if both references point to the SAME instance
        System.out.println(student1 == student2); // Should print: true

        // Modify student1's name
        student1.setName("John Doe");

        // Check student2 (it should reflect the change because they share the same instance)
        System.out.println(student2.getName()); // Should print: John Doe[cite: 27]
    }
}