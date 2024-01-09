package src.oops_30Dec;

import java.util.Scanner;

public class Lab120 {
    public static void main(String[] args) {
      //  int a = 10 ;
     //   int b= 23 ;
      //  b=10 , a=23

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b ");
        int b = sc.nextInt();

        int temp = a ;
        a = b ;
        b= temp ;

        System.out.println("Value of a -> " +a);
        System.out.println("Value of b -> " +b);

    }
}