package com.epam.conditions;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }

        int divisionResult = dividend / divider;
        int product = divisionResult * divider;

        if (product == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}

