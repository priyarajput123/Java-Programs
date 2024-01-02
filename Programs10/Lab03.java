/*Develop a program to check if a given string or number is a palindrome
(reads the same backward as forward).
 */
        package src.Programs10;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String or a number");
        String userInput = sc.nextLine();
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a Palindrome ");
        } else {
            System.out.println(userInput + "is not Palindrome");
        }
    }
            private static boolean isPalindrome(String input) {
              //Remove spaces and convert to lowercase for case-insensitivity
            String cleanedInput = input.replaceAll("\\s"," ").toLowerCase();
            //// Check if the cleaned string is equal to its reverse
            return cleanedInput.equals(new StringBuilder(cleanedInput).reverse().toString());

        }
    }