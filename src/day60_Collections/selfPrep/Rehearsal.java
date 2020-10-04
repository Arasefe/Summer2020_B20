package day60_Collections.selfPrep;

import java.util.*;

public class Rehearsal {
    public static void main(String[] args) {
        //methodListInterface(new String[]{"Aras","Tulpar","Efe"});
        //methodLinkedList();
        methodVector();
    }
    public static void methodListInterface(String[]arr){
//      List<String> names1 = new ArrayList<>();
//      List<String> names2 = new LinkedList<>();
//      List<String> names3 = new Vector<>();
//      Vector<String> names4 = new Stack<>();
//
      // Converting between Array and ArrayList

//      ArrayList<String>list=new ArrayList<>(Arrays.asList(arr));
//      System.out.println(list);

      List<String>list1=new ArrayList<>(9);
      list1.addAll(Arrays.asList(arr));
        System.out.println(list1);
    }

    public static void methodLinkedList(){
         /*
        LinkedList implements the Collection interface.
        Each item in the list is aware of the next item.
        It uses a doubly linked list internally to store the elements.
        It can store the duplicate elements.
        It maintains the insertion order and is not synchronized.
        In LinkedList, the manipulation is fast because no shifting is required.
         */

        List<Integer>number=new LinkedList<>();
        number.add(1);
        number.add(3);
        number.add(new Integer(9));
        number.add(5);
        number.add(1);
        number.add(new Integer(9));

        number.add(1,7);

        number.addAll(Arrays.asList(3,5,7,9));
        System.out.println(number);

        System.out.println("LinkedList: "+ number.get(1));

    }
    public static void methodVector(){
        /*
        Vector uses a dynamic array to store the data elements.
        It is similar to ArrayList.
        However, It is synchronized and contains many methods that are not the part of Collection framework.
        Since JDK 1.0
         */
        List<Integer>numbers=new Vector<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);
        numbers.add(3,0);


        System.out.println("Vector: "+numbers);
        System.out.println("Vector "+numbers.get(8));


    }

}
