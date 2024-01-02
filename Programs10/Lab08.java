/*Write a program that prints the multiplication table of a given number up to a certain
range.
 */

package src.Programs10;

import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        int number = getValidIntegerInput("Enter a number: ");

        // Get the range from the user
        int range = getValidIntegerInput("Enter the range: ");

        // Print the multiplication table
        printMultiplicationTable(number, range);
    }
    private static void printMultiplicationTable(int number,int range){
        System.out.println("Multiplication Table for " + number + "up  to" + range +" : ");
        for(int i=1;i<=range;i++){
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
    }
    }

    private static int getValidIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            try {
                System.out.print(prompt);
                input = scanner.nextInt();

                // Validate that the input is positive
                if (input <= 0) {
                    System.out.println("Please enter a positive integer.");
                    continue;
                }

                break; // Exit the loop if the input is valid
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }

        return input;
    }
}
