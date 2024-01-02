package src.oops_30Dec;

public class Lab117 {
    public static void main(String[] ref_name) {
        System.out.println("Run fineee");

        int d=main(10);
        System.out.println(d);
        main("priya");

    }
    static void main(String a){
        System.out.println("I am also main , but JVM didnt recognize me");
    }
    static int main(int a){
        return a+101;
    }
}
