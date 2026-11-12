package com.craft.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public int add(int a, int b) {
        System.out.println("  [Core Logic] Executing add(" + a + ", " + b + ")");
        return a + b;
    }

    public int divide(int a, int b) {
        System.out.println("  [Core Logic] Executing divide(" + a + ", " + b + ")");
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed!");
        }
        return a / b;
    }
}

