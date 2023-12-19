package src.basics4_17Dec;

public class Lab60 {
    public static void main(String[] args) {
        int itemCode = 002;
        switch(itemCode){
            case 001,002,003 :
                System.out.println("It is an Electronic Gadget");
                break;
            case 004,005 :
                System.out.println("It 's a mechanical device");
                break;
            default :
                System.out.println("It's a software Product");

        }

    }
}
