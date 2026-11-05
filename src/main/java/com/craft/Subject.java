package com.craft;

import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Subject {
    private String subjectName;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }
}