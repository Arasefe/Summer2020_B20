package day30_CustomMethods;

import java.util.Arrays;

public class _5ReturnMethods {


    public static void main(String[] args) {
        int[] arr = {100, 200, 50, 40, 60};
        int num = max1(arr);

        System.out.println(num);
        System.out.println(num > 300);

        // int num2 = max2(arr);


    }


    public static int max1(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        return max;
    }


    public static void max2(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];

    }


}
