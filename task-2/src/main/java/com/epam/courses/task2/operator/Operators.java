package com.epam.courses.task2.operator;

public class Operators {

    public void checkForParity(int number) {
        if(number % 2 == 0) {
            System.out.println(number + " - even number");
        }
        else {
            System.out.println(number + " - odd number");
        }
    }

    public void closestToTen(double numberOne, double numberTwo) {
        int ten = 10;
        double a = Math.abs(numberOne - ten);
        double b = Math.abs(numberTwo - ten);
        if(a < b) {
            System.out.println(numberOne + " nearer");
        }
        else if(a > b) {
            System.out.println(numberTwo + " nearer");
        }
        else {
            System.out.println(numberOne + " = " + numberTwo);
        }
    }

    public void checkForZero(int number) {
        if(number > 0) {
            System.out.println(number + " more than zero");
        }
        else if(number < 0) {
            System.out.println(number + " less than zero");
        }
        else {
            System.out.println(number + " is equal to zero");
        }
    }

    public void checkForZero(int numberOne, int numberTwo) {
        if(numberOne > 0 && numberTwo > 0) {
            System.out.println("both more than zero");
        } else {
            System.out.println("One of numbers less or equal to zero");
        }
    }

    public void printMonth(int number) {
        if (number == 1) {
            System.out.println("January");
        } else if (number == 2) {
            System.out.println("February");
        } else if (number == 3) {
            System.out.println("March");
        } else if (number == 4) {
            System.out.println("April");
        } else if (number == 5) {
            System.out.println("May");
        } else if (number == 6) {
            System.out.println("June");
        }else if (number == 7) {
            System.out.println("July");
        } else if (number == 8) {
            System.out.println("August");
        }else if (number == 9) {
            System.out.println("September");
        } else if (number == 10) {
            System.out.println("October");
        }else if (number == 11) {
            System.out.println("November");
        } else if (number == 12) {
            System.out.println("December");
        } else {
            System.out.println("No number");
        }
    }

}
