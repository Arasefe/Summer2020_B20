package day60_Collections.selfPrep;

import java.util.*;

public class Interface_Queue {
    public static void main(String[] args) {
        queueMethod();
    }
    public static void queueMethod(){
        Queue queue=new PriorityQueue<>();
        queue.addAll(Arrays.asList(1,2,3,4,5,6));
        queue.addAll(Arrays.asList(1,2,3,4,5,6));
        //queue.addAll(Arrays.asList(null));
        System.out.println(queue);          // [1, 2, 1, 2, 4, 6, 3, 4, 3, 5, 5, 6]

        Queue queue1=new ArrayDeque();
        queue1.addAll(Arrays.asList("a","b","c","d","e","f"));
        queue1.addAll(Arrays.asList("a","b","c","d","e","f"));
        //queue1.addAll(Arrays.asList(null));

        queue.poll();                       // [1, 2, 1, 2, 4, 6, 3, 4, 3, 5, 5, 6]
        System.out.println(queue);          // [1, 2, 3, 2, 4, 6, 6, 4, 3, 5, 5]
        queue.peek();
        System.out.println(queue);
        queue.element();
        System.out.println(queue);

    }
}
