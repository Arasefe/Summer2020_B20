package day60_Collections.muhtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_Practice2 {
    public static void main(String[] args) {
        //iteratorMethod1(new ArrayList<String>(Arrays.asList("Aras","Tulpar","Banu","Efe","Ismail","Ahmet","Mehmet")));
        //iteratorMethod2(new ArrayList<String>(Arrays.asList("Aras","Tulpar","Banu","Efe","Ismail","Ahmet","Mehmet")));
        iteratorMethod3(new ArrayList<String>(Arrays.asList("Aras","Tulpar","Banu","Efe","Ismail","Ahmet","Mehmet")));
    }

    public static void iteratorMethod1(ArrayList<String>list){
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String each=it.next();
            if(each.length()<4){
                list.remove(each);
            }
        }
        System.out.println(list);
    }

    public static void iteratorMethod2(ArrayList<String>list){
        for(Iterator<String>i= list.iterator();i.hasNext();){
            String each=i.next();
            if(each.equals("Ahmet")){
                list.remove(each);
            }
        }
        System.out.println(list);
    }

    public static void iteratorMethod3(ArrayList<String>list){
        list.removeIf(p->p.equals("Ahmet"));

        System.out.println(list);
    }


}
