package src.oops_30Dec;

import java.util.Scanner;

public class Lab122 {
    public static void main(String[] args) {
         try{
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the value for a ");
             int a = sc.nextInt();
             System.out.println("Enter the value for b");
             int b = sc.nextInt();

             a= a*b;
             b=a/b;
             a=a/b;

             System.out.println("Value of a - >a" +a);
             System.out.println("Value of b ->b " +b);
         }
         catch(Exception c){
            System.out.println("Not pososible with zero");
        }
    }
}
