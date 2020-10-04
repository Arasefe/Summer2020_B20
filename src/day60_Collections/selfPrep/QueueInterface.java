package day60_Collections.selfPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        queueInterface();
    }

    public static void queueInterface() {
        /*
        Queue interface maintains the first-in-first-out (FIFO) order.
        It can be defined as an ordered list that is used to hold the elements which are about to be processed.
        Accepts duplicates, does not have index number.
        poll() removes the first object that is inserted
        There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

         */
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.addAll(Arrays.asList(5, 6, 7, 8, 9));
        q1.addAll(Arrays.asList(5, 6, 7, 8, 9));
        System.out.println(q1);

        int firstObject = q1.poll();            // poll-->FIFO
        System.out.println(q1);
        int secondObject= q1.peek();
        System.out.println(q1);

        q1.poll();

        System.out.println(q1);

        //  q1.get(2); // queue has no index numbers

    }
}