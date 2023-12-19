package src.basics4_17Dec;

public class Lab59 {
    public static void main(String[] args) {
        byte b = 20;
        switch (b){
            case 10:
                System.out.println("TEN");
            case 20 :
                System.out.println("TWENTY");
            case 127 :
                System.out.println("ONE TWENTY EIGHT");
            default :
                System.out.println("Default");
        }
    }
}