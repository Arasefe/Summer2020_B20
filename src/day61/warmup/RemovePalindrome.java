package day61.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
warmup tasks:
    1. write a program that can remove the palindrome string from a list of String
            DO NOT use Lambda expressions


 */
public class RemovePalindrome {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>(Arrays.asList("Aras","Tulpar","Banu","Ismail","level"));
        removePalindrome(list);
    }
    public static void removePalindrome(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            String reversed="";
            for (int j = list.get(i).length()-1; j>=0; j--) {
                reversed+=list.get(i).charAt(j);
            }
            if(reversed.equals(list.get(i))){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }

    public static void removePalindrome2(String[] args) {
        String[] words = {"Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch20"};

        List<String> list = new ArrayList<>();
        list.addAll( Arrays.asList(words ) );

        System.out.println(list);

        Iterator<String> it = list.iterator();
        while( it.hasNext() ){
            String each = it.next(); // "ABC"
            String reverse = "";
            for(int i = each.length()-1; i >= 0; i-- ){
                reverse += each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }
        System.out.println(list);
    }

}
