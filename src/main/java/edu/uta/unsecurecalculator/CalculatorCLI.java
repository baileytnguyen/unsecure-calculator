package edu.uta.unsecurecalculator;

import java.util.Scanner;

public class CalculatorCLI {
    public static void main(String[] args) {
        UnsecureCalculator calculator = new UnsecureCalculator();
        Scanner scanner = new Scanner(System.in);
        float lastResult = 0;

        System.out.println("Welcome to the Unsecure Calculator CLI!");
        System.out.println("Type 'exit' to quit.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                calculator.exit();
                break; // just to make sure we exit the loop
            }

            String[] tokens = input.split(" ");
            String command = tokens[0].toLowerCase();

            try {

                switch (command) {
                    case "add":
                        if (tokens.length == 3) {
                            float a = Float.parseFloat(tokens[1]);
                            float b = Float.parseFloat(tokens[2]);
                            lastResult = calculator.add(a, b);
                            System.out.println("Result: " + lastResult);
                        } else {
                            System.out.println("Usage: add <num1> <num2>");
                        }
                        break;
                    case "subtract":
                        if (tokens.length == 3) {
                            float a = Float.parseFloat(tokens[1]);
                            float b = Float.parseFloat(tokens[2]);
                            lastResult = calculator.subtract(a, b);
                            System.out.println("Result: " + lastResult);
                        } else {
                            System.out.println("Usage: subtract <num1> <num2>");
                        }
                        break;
                    case "multiply":
                        if (tokens.length == 3) {
                            float a = Float.parseFloat(tokens[1]);
                            float b = Float.parseFloat(tokens[2]);
                            lastResult = calculator.multiply(a, b);
                            System.out.println("Result: " + lastResult);
                        } else {
                            System.out.println("Usage: multiply <num1> <num2>");
                        }
                        break;
                    case "divide":
                        if (tokens.length == 3) {
                            float a = Float.parseFloat(tokens[1]);
                            float b = Float.parseFloat(tokens[2]);
                            lastResult = calculator.divide(a, b);
                            System.out.println("Result: " + lastResult);
                        } else {
                            System.out.println("Usage: divide <num1> <num2>");
                        }
                        break;
                    case "modulo":
                        if (tokens.length == 3) {
                            float a = Float.parseFloat(tokens[1]);
                            float b = Float.parseFloat(tokens[2]);
                            lastResult = calculator.modulo(a, b);
                            System.out.println("Result: " + lastResult);
                        } else {
                            System.out.println("Usage: modulo <num1> <num2>");
                        }
                        break;
                    case "store":
                        calculator.store(lastResult);
                        System.out.println("Stored value: " + lastResult);
                        break;
                    case "retrieve":
                        lastResult = calculator.retrieve();
                        System.out.println("Retrieved value: " + lastResult);
                        break;
                    case "clear":
                        calculator.clear();
                        System.out.println("Stored value cleared.");
                        break;
                    default:
                        System.out.println("Unknown command. Available commands: add, subtract, multiply, divide, modulo, store, retrieve, clear, exit.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid numbers.");
            } catch (Exception e) {
                System.out.println("Unexpected error. Please try again.");
            }
        }

        scanner.close();
    }
}
