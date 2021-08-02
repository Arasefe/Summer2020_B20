package day43_Static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Data {

    static int[] arr = new int[3];                          // 1,2,3
    static ArrayList<Integer> list = new ArrayList<>();     // 4,5,6

    static{
        for (int i = 0; i < arr.length; i++) {
            arr[i]= new Random().nextInt(5);
            list.add(new Random().nextInt(50));
        }

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {

        System.out.println(list);                       // [4,5,6]
        System.out.println(Arrays.toString(arr));       // [1,2,3]

    }

}
