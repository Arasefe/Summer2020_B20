package day37_ArrayList;

import Office_Hours.Practice_07_06_2020.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class _8LambdaExpression {

    public static void main(String[] args) {
        remove1();
        remove2();
        remove3();
        remove4();

    }

    private static void remove1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9));
        list.removeIf(p -> p < 5);
        System.out.println(list);

        System.out.println("====================================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9));
        Predicate<Integer>lessThan5=p->p<5;
        list1.removeIf(lessThan5);
        System.out.println(list1);

    }

    private static void remove2(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            numbers.add(i);
        }
        numbers.removeIf(p -> p % 2 == 0);      // remove if the number is even
        System.out.println(numbers);

        System.out.println("====================================");

        ArrayList<Integer> numbers1 = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            numbers1.add(i);
        }
        Predicate<Integer> evenNumbers = p -> p % 2 == 0;
        numbers1.removeIf(evenNumbers);           // remove if the number is even
        System.out.println(numbers1);

    }

    private static void remove3(){
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mary", "Monica", "Aidan", "Travis", "Sam", "Richard", "Dan"));
        names.removeIf(p -> p.startsWith("M"));
        System.out.println(names);

        System.out.println("====================================");

        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Mary", "Monica", "Aidan", "Travis", "Sam", "Richard", "Dan"));
        Predicate<String>mStarters=p->p.startsWith("M");
        names2.removeIf(mStarters);
        System.out.println(names2);
    }

    private static void remove4(){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8, 9));
        nums.removeIf(p -> Collections.frequency(nums, p) != 1);
        //  for the elements that are not unique
        System.out.println(nums);

        System.out.println("====================================");

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8, 9));
        Predicate<Integer>uniques=p->Collections.frequency(nums,p)!=1;
        nums2.removeIf(uniques);
        System.out.println(nums2);

    }

}
