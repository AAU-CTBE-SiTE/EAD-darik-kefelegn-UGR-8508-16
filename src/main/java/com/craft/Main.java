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

    // This automatically runs when the app starts up to test the AOP aspect
    @Bean
    CommandLineRunner run(Calculator calculator) {
        return args -> {
            System.out.println("\n--- Calling calculator.add() ---");
            int result = calculator.add(10, 20);
            System.out.println("Result is: " + result);
        };
    }
}