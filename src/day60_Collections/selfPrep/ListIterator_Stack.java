package day60_Collections.selfPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ListIterator_Stack {
    public static void main(String[] args) {

    }

    public static void stack(){
        List<Integer> stack = new Stack<>(); // get, add, remove, set, removeAll, contains, size...
        stack.addAll(Arrays.asList(1,2,3,4,5));
        stack.addAll(Arrays.asList(1,2,3,4,5));
        stack.add(6);

        System.out.println("Stack: "+stack);
        System.out.println(stack.get(1));

        ( (Stack)stack ).pop();

        System.out.println(stack);
    }
}
