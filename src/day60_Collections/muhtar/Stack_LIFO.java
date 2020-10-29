package day60_Collections.muhtar;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Stack_LIFO {
    public static void main(String[] args) {
        Vector<Integer> list=new Stack<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        ((Stack)(list)).pop();
        list.add(2,3);
        ((Stack)list).pop();
        System.out.println(list);
    }
}
