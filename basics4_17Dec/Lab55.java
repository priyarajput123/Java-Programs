package src.basics4_17Dec;

import java.util.Scanner;

public class Lab55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser Name Chrome , firefox , edge ,Opera");
        String browser = sc.nextLine();
        switch(browser.toLowerCase()){
            case  "chrome" :
                System.out.println("Excute the Chrome Code");
                break;
            case  "firefox" :
                System.out.println("Execute the Firefox Code");
                break;
            case  "edge" :
                System.out.println("Execute the Edge Code");
                break;
            default :
                System.out.println("I have not idea which browser is this");
        }
    }
}


