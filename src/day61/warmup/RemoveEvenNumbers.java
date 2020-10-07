package day61.warmup;

import java.util.*;

/*
2. write a program that can remove the even numbers from a Set of Integers
            DO NOT use Lambda expressions
 */
public class RemoveEvenNumbers {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        removeEvenNumbers(set);
    }

    public static void removeEvenNumbers(Set<Integer> set) {
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }
        System.out.println(set);

    }

    public static void removeEvenNumbers() {
        Integer[] num ={111,113,100, 900, 90, 80, 76, 120, 55, 22, 23, 45, 65, 6, 9,9,9,9,9,9,9,9,9};
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(num));

        System.out.println(set);

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            if(it.next() % 2 == 0  ){
                it.remove();
            }
        }

        System.out.println(set);



    }

}

