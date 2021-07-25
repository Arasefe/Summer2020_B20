package day32_MethodOverloading;

import java.util.Arrays;

public class _5MethodOverloading {

    // For method overloading parameter must be different either number of parameters or data type
    public static void main(String[] args) {
        int[] arr = {9,8,7};
        Arrays.sort(arr);

        String[] names = {"D", "C", "B"};
        Arrays.sort(names);

    }
    public static void method(byte a){

    }


    public static void method(short a){

    }

    public static void method(int a){

    }

    public static void method(long a){

    }

    public static void method(float c){

    }

    public static void method(double c){

    }

    public static void method(char c){

    }

    public static void method(boolean c){

    }

    public static void method(int i, double d){

    }

    public static void method(double d, int i){

    }

}
