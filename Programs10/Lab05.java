/*Develop a program that counts the number of vowels and consonants
in a given string using loops and conditions.
 */

        package src.Programs10;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a stirng :");
        String inputString = sc.nextLine().toLowerCase();   // Convert to lowercase for case-insensitivity
        int vowelCount =0;
        int consonantCount =0;

        for(int i=0;i<inputString.length();i++){
            char currentChar = inputString.charAt(i);
            if(currentChar>= 'a' && currentChar <= 'z'){
                //Check if the charcter is a vowel
                if(currentChar == 'a' || currentChar == 'e' ||currentChar == 'i' ||
                        currentChar == 'o' || currentChar == 'u') {
                    vowelCount++;
                }
                else{
                    consonantCount++;
                }
                }
        }
        System.out.println("Number of vowels : " +vowelCount);
        System.out.println("Number of consonants : " + consonantCount);
    }
}
