//Prime Number Checker: Create a program that checks if a given number is prime or not.
// Use loops to divide the number by all numbers lesser than it to check for divisibility.


package src.Programs10;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        boolean isPrime = checkPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        sc.close();
    }

    private static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;         //0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
                // If the number is divisible by any number
                // between 2 and its square root, it's not prime
            }

        }
        return true; //If no divisor is found, the number is prime
    }
    }




