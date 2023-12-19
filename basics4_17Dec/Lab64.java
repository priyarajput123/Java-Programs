package src.basics4_17Dec;

public class Lab64 {
    public static void main(String[] args) {
        char code ='B' ;
        int val = switch(code){
            case 'A':
                yield 65;                  //yield is similar to sout
            case 'B' :
                yield 66;
            default:
                throw new IllegalStateException("Unexpected value: " + code);

        };
        System.out.println(val);
    }
}
