package day33_LocalDateTime;

import java.util.Arrays;

public class _2Task {
    public static void main(String[] args) {
        int[]arr=descending(new int[]{1,2,3,46,7,8});
        System.out.println(Arrays.toString(arr));

        double[]dArr=descending(new double[]{1.5,4.5,5.5,6.6});
        System.out.println(Arrays.toString(dArr));

        String[]strArr=descending(new String[]{"Aras","Efe","Ege","Tulpar","Ismail","Banu"});
        System.out.println(Arrays.toString(strArr));

        char[]charArr=descending(new char[]{'a','b','e','t','i'});
        System.out.println(Arrays.toString(charArr));
    }

    private static int[] descending(int[]array){
        Arrays.sort(array);
        int[]descArr=new int[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            descArr[j]=array[i];
            j++;
        }
        return descArr;
    }

    private static double[] descending(double[]array){
        Arrays.sort(array);
        double[]descArr=new double[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            descArr[j]=array[i];
            j++;
        }
        return descArr;
    }

    private static String[] descending(String[]array){
        Arrays.sort(array);
        String[]descArr=new String[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            descArr[j]=array[i];
            j++;
        }
        return descArr;
    }

    private static char[] descending(char[]array){
        Arrays.sort(array);
        char[]descArr=new char[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            descArr[j]=array[i];
            j++;
        }
        return descArr;
    }
}
