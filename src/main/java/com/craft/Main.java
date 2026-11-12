package com.craft;

import com.craft.service.Calculator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner run(Calculator calculator) {
        return args -> {
            System.out.println("\n--- Testing normal execution ---");
            calculator.add(10, 20);

            System.out.println("\n--- Testing exception execution ---");
            try {
                calculator.divide(10, 0);
            } catch (Exception e) {
                // Handled
            }
        };
    }
}