package day33_LocalDateTime;

import java.util.Arrays;

public class _3Task {
    public static void main(String[] args) {
       uniqueNumbers(new int[]{1,2,3,4,4,23,34,4,4,3,34,45,1});
       uniqueNumbers(new double[]{2.3,4.5,6.8,7.8,9.0,2.3,5.6});
       uniqueNumbers(new String[]{"Aras","Tulpar","Efe","Ege","Banu","Ismail","Aras","Tulpar"});


    }

    private static void uniqueNumbers(int[]array){

        for (int i : array) {
            int count=0;
            for (int each : array) {
               if(each==i){
                   count++;
               }
            }
            if(count==1){
                System.out.print(i+" ");
            }

        }
        System.out.println();

    }

    private static void uniqueNumbers(double[]array){

        for (double element : array) {
            int count=0;
            for (double each : array) {
                if(each==element){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }

        }
        System.out.println();

    }

    private static void uniqueNumbers(String[]array){

        for (String element : array) {
            int count=0;
            for (String each : array) {
                if(each.equals(element)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }

        }
        System.out.println();

    }

}
