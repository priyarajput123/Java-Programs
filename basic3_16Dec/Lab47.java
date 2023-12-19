package src.basic3_16Dec;

import java.util.Scanner;

public class Lab47 {
    public static void main(String[] args) {
        //Take an Input from user ?Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ,I will tell u if it is even/odd");
        int a = sc.nextInt();
        if(a%2==1){
            System.out.println("The number is ODD");
        }else {
            System.out.println("The number is EVEN");
        }
    }
}
