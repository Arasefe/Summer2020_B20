package day25_Practices;

import java.util.Arrays;

public class _6CombineTwoArrays {

    public static void main(String[] args) {
        combineTwoArrays();
    }
    private static void combineTwoArrays(){
        int[] arr1 = {1,2,3, 4,5,6,78,98,12,12,1321,312,321,112};
        int[] arr2 = {4,5,4,5,6,7,8,9,0};

        int[] combined = new int[arr1.length + arr2.length]; // 5

        int index = 0;

        for(int each: arr1){
            combined[index] = each ;
            index+=1;
        }

        for(int each: arr2){
            combined[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(combined) );

        Arrays.sort(combined);

        System.out.println(Arrays.toString(combined) );

        System.out.println("Maximum: "+combined[combined.length-1]);



    }

}
