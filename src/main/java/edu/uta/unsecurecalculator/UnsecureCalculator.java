package edu.uta.unsecurecalculator;

public class UnsecureCalculator {

    // Field to store the last result
    private float storedValue;

    // Constructor
    public UnsecureCalculator() {
    }

    // Method to add two numbers
    public float add(float a, float b) {
        return a + b;
    }

    // Method to subtract two numbers
    public float subtract(float a, float b) {
        return a - b;
    }

    // Method to multiply two numbers
    public float multiply(float a, float b) {
        return a * b;
    }

    // Method to divide two numbers
    public float divide(float a, float b) {
        return a / b;
    }

    // Method to compute the modulo of two numbers
    public float modulo(float a, float b) {
        return a % b;
    }

    // Method to store a value
    public void store(float value) {
        this.storedValue = value;
    }

    // Method to retrieve the stored value
    public float retrieve() {
        return this.storedValue;
    }

    // Method to clear the stored value
    public void clear() {
        this.storedValue = 0;
    }

    // Method to exit the calculator
    public void exit() {
        System.out.println("Exiting the calculator.");
        System.exit(0);
    }
}
