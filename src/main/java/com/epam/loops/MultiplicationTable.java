package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.println("Multiplication table for " + numberTableToPrint + ":");

        for (int i = 1; i <= 10; i++) {
            int product = numberTableToPrint * i;
            System.out.println(numberTableToPrint + " x " + i + " = " + product);
        }
    }
}
