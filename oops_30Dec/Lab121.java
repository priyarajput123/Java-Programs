package src.oops_30Dec;

import java.util.Scanner;

public class Lab121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a");
        int a = sc.nextInt();
        System.out.println("Enter the value for b");
        int b = sc.nextInt();

        a= a+b;
        b= a-b;
        a= a-b ;

        System.out.println("After swapping:"
                + " a = " + a + ", b = " + b);


    }
}
