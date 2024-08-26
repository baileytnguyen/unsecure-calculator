package edu.uta.unsecurecalculator;

public class Calculator {

    // Field to store the last result
    private double storedValue;

    // Constructor
    public Calculator() {
        // Initialize storedValue to 0
        this.storedValue = 0;
    }

    // Method to add two numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    // Method to compute the modulo of two numbers
    public double modulo(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a % b;
    }

    // Method to store a value
    public void store(double value) {
        this.storedValue = value;
    }

    // Method to retrieve the stored value
    public double retrieve() {
        return this.storedValue;
    }

    // Method to clear the stored value
    public void clear() {
        this.storedValue = 0;
    }

}
