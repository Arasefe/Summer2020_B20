package day60_Collections.muhtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_Practice1 {
    public static void main(String[] args) {
//        removeObjects1(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,5,6,76,8)));
//        removeObjects2(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,5,6,76,8)));
//        removeObjects3(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,5,6,76,8)));
        removeObjects4(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,5,6,76,8)));
    }

    public static void removeObjects1(ArrayList<Integer>list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<5){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    public static void removeObjects2(ArrayList<Integer>list){
        for (Integer each : list) {
            if(each<5){
                list.remove(each);
            }
        }
        System.out.println(list);
    }
    public static void removeObjects3(ArrayList<Integer>list){
        list.removeIf(p->p<5);          // internally uses iterator
        System.out.println(list);
    }

    public static void removeObjects4(ArrayList<Integer>list) {
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer i=it.next();
            if(i<5){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
