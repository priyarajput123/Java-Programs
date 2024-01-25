/*Data abstraction is the process of hiding certain details and showing only
essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create
objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body.
The body is provided by the subclass (inherited from).

 */

package src.oops13Jan_24.abstraction;

public class Animal2 {
    abstract class Animal{       //Abstrct class
        public abstract void animalSound();    //Abstrct Method dont have body
        public void sleep(){         //Regular method
            System.out.println("Zzzzzzz");
        }
        // Subclass (inherit from Animal)
        static class Pig extends Animal{
            public void animalSound(){    // The body of animalSound() is provided here
                System.out.println("The pig says : wee weee");
            }
        }
        class Animal2{
            public static void main(String[] args) {
                Pig myPig = new Pig(); //Create a pig object
                myPig.animalSound();
                myPig.sleep();
            }
        }
    }
}

