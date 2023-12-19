package src.basic3_16Dec;

public class Lab33 {
    public static void main(String[] args) {
        String name = "The Testing Academy" ;
        String name1 = "The Testing Academy" ;
        String name2 = new String("The Testing Academy"); //Heap Area

        System.out.println(name==name1);
        System.out.println(name.equals(name1));
        System.out.println(name==name2);
        System.out.println(name.equalsIgnoreCase(name2));

    }
}


