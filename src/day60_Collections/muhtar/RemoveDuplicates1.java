package day60_Collections.muhtar;

import java.util.*;

public class RemoveDuplicates1 {
    /*
    1. write a program that can identify if two strings are built out of same characters
            str1 = "abcabc"
            str2 = "cab"
            output:
                true
            str1 = "cabccccccaaaaaa";
            str2 = "bca";
            output:
                true
     */

    public static void main(String[] args) {
//        System.out.println(anagram1());
//        System.out.println(anagram2());
//        System.out.println(anagram3());
        System.out.println(anagram4());

    }
    public static boolean anagram1(){
        String str1 = "abcabc";
        String str2 = "cab";
        HashSet<String> s1 = new HashSet<>(Arrays.asList(str1.split("")));
        s1.toString();
        //System.out.println(s1);

        HashSet<String> s2= new HashSet<>(Arrays.asList(str2.split("")));
        s2.toString();
        //System.out.println(str2);

        return s1.equals(s2);

    }

    public static boolean anagram2(){
        String str1 = "abcabc";
        String str2 = "cab";

        Set<String>s1=new LinkedHashSet<>(Arrays.asList(str1.split("")));
        s1.toString();


        Set<String>s2=new LinkedHashSet<>(Arrays.asList(str2.split("")));
        s2.toString();

        return s1.equals(s2);

    }

    public static boolean anagram3(){
        String str1 = "abcabc";
        String str2 = "cab";


        str1=new TreeSet<>(Arrays.asList(str1.split(""))).toString();

        str2=new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        return str1.equals(str2);
    }

    public static boolean anagram4(){
        String str1 = "babcabcaaaccbbcb";
        String str2 = "cab";
        Set<String>list1=new TreeSet<>();
        list1.addAll(Arrays.asList(str1.split("")));
        str1=list1.toString();

        Set<String>list2=new HashSet<>();
        list2.addAll(Arrays.asList(str2.split("")));
        list2.toString();
        return list1.equals(list2);
    }

}
