package src.basic3_16Dec;

import java.util.Scanner;

public class Lab48 {
    public static void main(String[] args) {
        // Take three input from user and give max out of two number
        // a,b  a>b -> a, else b
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){
            System.out.println("Max is " + a);
        }else{
            System.out.println("Min is " + b);
        }
    }
}
//concatation - combine two or more thing


