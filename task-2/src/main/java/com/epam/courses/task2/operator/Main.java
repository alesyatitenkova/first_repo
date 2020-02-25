package com.epam.courses.task2.operator;

public class Main {
    public static void main(String[] args) {
        Operators operators = new Operators();
        operators.checkForParity(1);
        operators.checkForParity(0);
        operators.checkForParity(10);
        operators.checkForZero(5);
        operators.checkForZero(0);
        operators.checkForZero(-1);
        operators.closestToTen(8.5,11.45);
        operators.closestToTen(9.9,11.45);
        operators.closestToTen(11.45,11.45);
        operators.checkForZero(5,2);
        operators.checkForZero(-1,2);
        operators.checkForZero(0,2);
        operators.printMonth(1);
        operators.printMonth(2);
        operators.printMonth(3);
        operators.printMonth(4);
        operators.printMonth(5);
        operators.printMonth(6);
        operators.printMonth(7);
        operators.printMonth(8);
        operators.printMonth(9);
        operators.printMonth(10);
        operators.printMonth(11);
        operators.printMonth(12);
        operators.printMonth(13);
        operators.printMonth(0);
        operators.printMonth(-1);
    }
}
