/*A number with more than two factors is called a composite number. For example, 5 is prime because the only ways of writing it as a product, 1 × 5 or 5 × 1, involve 5 itself.
Here are some other examples of prime numbers: 13, 17, 19, 23, 29.
*/

package src.oops_30Dec;

import java.util.Scanner;

public class Lab126 {
    public static void main(String[] args) {
        // Prime Number Condition num%i(i -> 2 to num) == 0 -> x
        //  0 -> X
        // 1 -> X
        // 2 -> prime?
        // 3 -> ?
        // 4 -> ?
        int i=0;
        int flag =0;
        int m =0 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n =sc.nextInt();

//        17 -> 2 to 17/2 -> num%i == 0 -> not a prime
//
        m = n/2;
        if(n==0 || n==1){
            System.out.println("Not a prime -> " +n);
        }
        else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("Not a prime number");
                    flag = 1;
                    break;
                }
            }
        }

        if(flag ==0 ){
            System.out.println("Prime Number" + n);
        }
    }
}
