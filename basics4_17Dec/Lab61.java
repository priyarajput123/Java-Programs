package src.basics4_17Dec;

public class Lab61 {
    public static void main(String[] args) {
        int itemCode=003;
        switch(itemCode){
            case 001 -> System.out.println("It's a laptop");
            case 002 -> System.out.println("It's a desktop");
            case 003 ,004 -> System.out.println("It's a moblie phone");
            default-> System.out.println("Helloooo");
        }
    }
}

