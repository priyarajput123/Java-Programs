package src.basics5_23Dec;

import java.util.Scanner;

public class Lab67 {
    public static void main(String[] args) {
        //Take user input & print info
        Scanner user_input= new Scanner(System.in);
        System.out.println("Enter your name");
        String name = user_input.next();

        System.out.println("Enter your age");
        int age= user_input.nextInt();

        System.out.println("Enter your salary");
        double salary= user_input.nextDouble();

        System.out.println("Your details are " + name);
        System.out.println("Your details are " + age);
        System.out.println("Your details are " + salary);

        user_input.close();
    }
}



