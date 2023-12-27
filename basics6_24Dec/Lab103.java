package src.basics6_24Dec;

public class Lab103 {
    public static void main(String[] args) {
        int[] int_array={34,45,46};
        long[] l_array= {43l,45l,43l};
        float[] f_array = {45.56f,32.34f,43.45f};
        double[] d_array ={34.3 , 43.4,12.32};

        boolean[] b_array ={true,false,true,false};
        char[] c_array = {'A','B','D'};
        String[] names = {"Pramod" ,"Amit","Alok"};

        System.out.println(int_array.length);
        System.out.println(names.length);

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

    }
}
