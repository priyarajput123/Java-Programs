package src.oops_30Dec;

public class Lab125 {
    public static void main(String[] args) {
        String name = "Priya" ;
        String y = " ";
        for(int i=name.length()-1;i>=0;i--){
            y=y+name.charAt(i);
        }
        System.out.println(y);
    }
}