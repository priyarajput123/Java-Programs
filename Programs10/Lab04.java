//Write a program to calculate the factorial of a given number using loops.


package src.Programs10;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial");
        int number = sc.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);

    }

    private static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers .");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

