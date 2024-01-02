/*Create a program that converts temperatures from Fahrenheit to Celsius and
vice versa, using conditional statements to handle the direction of conversion.
 */


package src.Programs10;

import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the conversion direction from the user
        System.out.print("Enter the conversion direction (F2C for Fahrenheit to Celsius, C2F for Celsius to Fahrenheit): ");
        String conversionDirection = scanner.nextLine().toUpperCase();

        // Get the temperature value from the user
        double temperature = getValidDoubleInput("Enter the temperature: ");

        // Perform the conversion based on the user's input
        double convertedTemperature;

        if (conversionDirection.equals("F2C")) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equal to " + convertedTemperature + " Celsius.");
        } else if (conversionDirection.equals("C2F")) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
        } else {
            System.out.println("Invalid conversion direction. Please enter F2C or C2F.");
        }
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double getValidDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double input;

        while (true) {
            try {
                System.out.print(prompt);
                input = scanner.nextDouble();
                break; // Exit the loop if the input is valid
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }

        return input;
    }
    }
