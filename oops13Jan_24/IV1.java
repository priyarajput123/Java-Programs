package src.oops13Jan_24;


import src.basics7_6Jan2024.Person;

public class IV1 {
    public static void main(String[] args) {
        Person h = new Person();
        System.out.println(h.a);

        Person h2 = new Person(23);
        System.out.println(h2.a);

        Person h3 = new Person(23,true);
        // System.out.println(h2.a);
        //      System.out.println(h3.b);

        System.out.println(h.b);
        h.a=99;
        System.out.println(h.a);
    }


