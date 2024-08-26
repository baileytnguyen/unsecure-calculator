package edu.uta.unsecurecalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Example usage
        UnsecureCalculator calculator = new UnsecureCalculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command (add, subtract, multiply, divide, modulo, store, retrieve, clear, exit):");

            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("exit")) {
                calculator.exit();
            }
        }
    }
}
