package com.craft.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public int add(int a, int b) {
        System.out.println("-> Executing core business logic: adding numbers...");
        return a + b;
    }
}
