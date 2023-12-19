package src.basic3_16Dec;

public class Lab27 {
    public static void main(String[] args) {
        //Casting - Mold
        //Widening is the process of converting lower type to higher type .
        //This is safe conversion .

        byte b =10;
        //int a = b  //Implicit Casting -JVM
        int a =(int) b;  //Explict Casting -JVM


        // Narrowing is the process of converting higher type to lower type.

        int a1 =300;
       // byte b1 =a1 ; //Invalid -Implict Casting
        byte b1 = (byte)a1;
        System.out.println(b1); //here we converting from 300 a byte so it will just a
        //portion



        // 32 Bits
// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
// will be sotred into the b
// 0 0 1 0 1 1 0 0
//        0 * 27 + 0 * 26 + 1 * 25 + 0 * 24 + 1 * 23 + 1 * 22 + 0 * 21 + 0 * 20
//        0 + 0 + 32 + 0 + 8 + 4 + 0 + 0
//44
    }
}





