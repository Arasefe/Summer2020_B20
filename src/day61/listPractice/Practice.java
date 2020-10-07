package day61.listPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Practice {
    public static void main(String[] args) {
        List<String> list=new Vector<>();
        list.addAll(Arrays.asList("Aras","Tulpar","Aras","Banu","Ismail","Ismail"));
        System.out.println(list);
        System.out.println(list.get(2));

        Stack<String>stack=new Stack<>();
        stack.addAll(list);                 // added the list to stack
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());

    }
}
