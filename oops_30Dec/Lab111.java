package src.oops_30Dec;

public class Lab111 {
    public static void main(String[] args) {
         int c= priya_sum(3,5);
        System.out.println(c);
         int c1=priya_sum(3);
        System.out.println(c1);
        int c2=priya_sum();
        System.out.println(c2); //No arguments

        SayHello();                      //Call to function
        int c3=priya_sum(2,3,2);
        System.out.println(c3);
    }
    static  int priya_sum(int input_1,int input_2){                //Definition of funtion
        return input_1+input_2;
    }
    static int priya_sum(int input_1){
        return input_1;
    }
    static int priya_sum(){
        return 99;
    }
    static int priya_sum(int input_1,int input_2,int c){
        return  input_1+input_2+c;
    }
    static void SayHello(){
        System.out.println("Say Yes");
    }

}
