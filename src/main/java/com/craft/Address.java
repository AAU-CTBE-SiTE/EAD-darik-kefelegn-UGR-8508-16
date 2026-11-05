package com.craft;

import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.ToString;

@Component("address")
@Data
@ToString
public class Address {
    private String city = "Addis";
    private String country = "Ethiopia";
}