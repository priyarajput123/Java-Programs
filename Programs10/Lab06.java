package src.Programs10;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number from the user
        int number = getValidIntegerInput("Enter a number");
        // Calculate the sum of digits
        int sumOfDigits = calculateSumOfDigits(number);
        // Display the result
        System.out.println("Sum of digits: " + sumOfDigits);

    }
    private static int calculateSumOfDigits(int num){
        int sum=0;
        // Iterate through each digit and add to the sum
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    private static int getValidIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            try {
                System.out.print(prompt);
                input = scanner.nextInt();
                break; // Exit the loop if the input is valid
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }

        return input;
    }
}