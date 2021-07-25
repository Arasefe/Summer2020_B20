package day34_WrapperClasses;

import java.util.ArrayList;

public class _8ListPractice {

    public static void main(String[] args) {
        maxMinOfArray();
    }
    private static void maxMinOfArray(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(30);
        list.add(410);
        list.add(310);
        list.add(210);
        list.add(2,350);
        list.add(1,20);
        list.set(4,380);
        list.set(2,25);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer each  : list){

            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }

        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);



    }

}
