package src.oops13Jan_24;

public class BlockClass {

    { // Instance Initialization Block
        System.out.println("I am IIB");
    }

    BlockClass(){
        System.out.println("I am DC");
    }

    static { // SIB Static Initialization Block
        System.out.println("I am SIB");
    }
}
