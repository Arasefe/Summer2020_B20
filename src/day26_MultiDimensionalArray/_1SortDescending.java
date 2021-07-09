package day26_MultiDimensionalArray;

import java.util.Arrays;


public class _1SortDescending {
    //  1. write a program that can sort the array in descending order
    public static void main(String[] args) {

        sortDescending();
    }

    private static void sortDescending(){
        int[] arr ={ 10, 11, 8, 9, 12, 5, 15};
        Arrays.sort(arr);                           // {5,8,9,10,11,12,15}
        System.out.println("Ascending Array "+Arrays.toString(arr));

        int[] desc = new int[arr.length];           // { 3, 2, 1}

        int k =arr.length-1;
        for(int i =0; i <= desc.length-1; i++ ){    //i: 0, 1, 2
            desc[i] =  arr[k];
            k--;                                    // k: 2, 1, 0
        }


        System.out.println("Descending Array "+Arrays.toString(desc));

    }

}
