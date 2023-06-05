package com.amrita.jpl

abstract class Calculator {
    abstract double add(double num1, double num2);
    abstract double subtract(double num1, double num2);
    abstract double multiply(double num1, double num2);
    abstract double divide(double num1, double num2);
}

class BasicCalculator extends Calculator {
    @Override
    double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}
