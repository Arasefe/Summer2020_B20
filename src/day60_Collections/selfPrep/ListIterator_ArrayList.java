package day60_Collections.selfPrep;

import java.util.*;

public class ListIterator_ArrayList {
    public static void main(String[] args) {
        //instantiation();
        listIterator();
    }

    public static void instantiation(){
        List<String> list1=new ArrayList<>();
        List<String> list2=new LinkedList<>();
        List<String> list3=new Vector<>();
        List<String> list4=new Stack<>();
    }

    public static void listIterator(){
        // Non-synchronized
        // Ordered
        // Good for random access
        // Not good for inserting, deleting, removal
        // Since JDK 1.2
        List<String> list=new ArrayList<>();
        list.add("Aras");
        list.add("Tulpar");
        list.add("Efe");
        list.add("Ege");

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String each=it.next();
            if(each.length()<4){
                list.remove(each);
            }
        }
        System.out.println(list);


    }
}
