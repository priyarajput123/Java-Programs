package src.oops13Jan_24;

public class IV2 {
    public static void main(String[] args) {
        Person02 h1= new Person02();
        Person02 h2= new Person02();
        Person02 h3= null;
        //h3.run();
        h2.run();


    }
    static class Person02{
        int a;
        void run(){
            System.out.println("Run called");
        }
    }

}