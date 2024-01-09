package src.oops_30Dec;

public class Lab127 {
    public static void main(String[] args) {
        String name ="Priya" ;
        char [] charArray = name.toCharArray();
        System.out.println(charArray.length);
        // o/p->ayirp

        int left =0;
        int right = charArray.length-1;
        while(left<right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray [right] = temp;

            left++;
            right--;
        }
        String rev_name = new String(charArray);
        System.out.println(rev_name);
    }
}


