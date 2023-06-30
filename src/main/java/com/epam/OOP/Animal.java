package com.epam.OOP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public String getDescription() {
        String pawString = (numberOfPaws == 1) ? "paw" : "paws";
        String furString = hasFur ? "a" : "no";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawString + " and " + furString + " fur.";
    }


}
