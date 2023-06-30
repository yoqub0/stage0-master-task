package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean satisfiesInequality = (firstSide + secondSide > thirdSide) &&
                (firstSide + thirdSide > secondSide) &&
                (secondSide + thirdSide > firstSide);


        if (satisfiesInequality) {
            System.out.println("This is a valid triangle.");
        } else {
            System.out.println("It's not a triangle.");
        }
    }

}
