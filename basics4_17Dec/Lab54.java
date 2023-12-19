package src.basics4_17Dec;

import java.util.Scanner;

public class Lab54 {
    public static void main(String[] args) {
        // If, Switch -  Condition Based
        // Loops -> Which will repeat something - for, while, do while

        // Switch - Condition based - Multiple Condition


        // Which day is today!!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1-7 , I will tell day it is");
        int dayNumber = sc.nextInt();

        switch (dayNumber){
            case 1 :
            System.out.println("Monday");
            break;

            case 2 :
            System.out.println("Tuesday");
            break;

            case 3 :
            System.out.println("Wednesday");
            break;

            case 4 :
            System.out.println("Thrusday");
            break;

            case 5 :
            System.out.println("Friday");
            break;

            case 6 :
            System.out.println("Saturday");
            break;

            case 7 :
            System.out.println("Sunday");
                break;

            default:
                System.out.println("ARE U MAD");
                break;     // This break optional if default is last option
        }
        System.out.println("End of Program--");


    }
}
