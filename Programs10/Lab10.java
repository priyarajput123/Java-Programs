/* Grade Calculator: Develop a program that calculates grades based on score input.
Use conditional statements to assign letter grades (A, B, C, D, F) based on score ranges.
 */

package src.Programs10;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Get the score from user
        double score = getValidDoubleInput("Enter the score");
        //Calculate and display the letter grade
        char letterGrade = calculateLetterGrade(score);
        System.out.println("The letter grade for the score " + score + " is: " + letterGrade);

    }

    private static char calculateLetterGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        }else{
            return 'F';
        }
    }

    private static double getValidDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double input;

        while (true) {
            try {
                System.out.print(prompt);
                input = scanner.nextDouble();

                // Validate that the input is within a valid range
                if (input < 0 || input > 100) {
                    System.out.println("Please enter a valid score between 0 and 100.");
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