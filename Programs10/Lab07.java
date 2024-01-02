/*Write a program that calculates simple interest given principal, rate,
and time. Use conditionals to validate input values.
 */


package src.Programs10;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get principal amount
        double principal = getValidDoubleInput("Enter the principal amount: ");

        // Get interest rate
        double rate = getValidDoubleInput("Enter the annual interest rate (as a decimal): ");

        // Get time in years
        double time = getValidDoubleInput("Enter the time in years: ");

        // Calculate simple interest
        double simpleInterest = (principal * rate * time);

        // Display the result
        System.out.println("Simple Interest: " + simpleInterest);
    }

    private static double getValidDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double input;

        while (true) {
            try {
                System.out.print(prompt);
                input = scanner.nextDouble();

                // Validate that the input is non-negative
                if (input < 0) {
                    System.out.println("Please enter a non-negative value.");
                    continue;
                }

                break; // Exit the loop if the input is valid
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }

        return input;
    }
}

