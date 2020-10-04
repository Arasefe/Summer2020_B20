package day60_Collections.selfPrep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator_LinkedList {
    public static void main(String[] args) {
        listIterator();
    }
    public static void listIterator(){
        /*
        LinkedList implements the Collection interface.
        Each item in the list is aware of the next item.
        It uses a doubly linked list internally to store the elements.
        It can store the duplicate elements.
        It maintains the insertion order and is not synchronized.
        In LinkedList, the manipulation is fast because no shifting is required.
         */
        List<String> list=new LinkedList<>();
        list.add("Aras");
        list.add("Tulpar");
        list.add("Efe");
        list.add("Ege");

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String each=it.next();
            if(each.equals("Efe")){
                list.remove(each);
            }
        }
        System.out.println(list);

        list.add(1,"Sam");
        System.out.println(list);
    }
}
