package day30_CustomMethods;

import java.util.Arrays;

public class _6ReturnMethods {

    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 = {4,5,6};

        int[] a3 = combine2Arrays(a1, a2);

        System.out.println(Arrays.toString(a3));
        System.out.println( a3[0] );


    }



    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            combined[i] = each;
            i++;
        }

        for(int each : arr2){
            combined[i]= each;
            i++;
        }

        return combined;

    }

}
