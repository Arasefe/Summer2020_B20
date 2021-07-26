package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _7RemovePractice {

    public static void main(String[] args) {
        remove1();
        remove2();
        remove3();


    }
    private static void remove1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,4,4,5,6,6,6,6,7,7));
        // remove all the numbers that are less than 5
        for(int i = 0; i <= list.size()-1; i++){
            if(  list.get(i) < 5  ){
                list.remove(i);
            }
        }

        System.out.println(list);

    }

    private static void remove2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,4,4,5,6,6,6,6,7,7));
        list.removeIf(p->p<5);
        System.out.println(list);
    }

    private static void remove3(){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,4,4,5,6,6,6,6,7,7));
            list.removeIf(p->p>3);
            System.out.println(list);

    }

}
