package edu.uta.unsecurecalculator;

public class UnsecureCalculator {

    // Field to store the last result
    private float storedValue;

    // Constructor
    public UnsecureCalculator() {
    }

    // Method to add two numbers
    public float add(float a, float b) {
        float result = a + b;
        return handleSpecialValues(result, "addition");
    }

    // Method to subtract two numbers
    public float subtract(float a, float b) {
        float result = a - b;
        return handleSpecialValues(result, "subtraction");
    }

    // Method to multiply two numbers
    public float multiply(float a, float b) {
        float result = a * b;
        return handleSpecialValues(result, "multiplication");
    }

    // Method to divide two numbers
    public float divide(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        float result = a / b;
        return handleSpecialValues(result, "division");
    }

    // Method to compute the modulo of two numbers
    public float modulo(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot modulo by zero.");
        }
        float result = a % b;
        return handleSpecialValues(result, "modulo");
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

    private float handleSpecialValues(float result, String operation) {
        if (Float.isInfinite(result)) {
            throw new ArithmeticException("Overflow occurred during " + operation + ".");
        }
        if (Float.isNaN(result)) {
            throw new ArithmeticException("Invalid operation resulted in NaN during " + operation + ".");
        }
        return result;
    }
}
