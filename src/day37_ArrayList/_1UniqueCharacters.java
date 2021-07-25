package day37_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _1UniqueCharacters {

    public static void main(String[] args) {
        //uniqueCharacters1("jsdcsjdfhnkfdf");
        uniqueCharacters2("jsdcsjdfhnkfdf");
    }

    private static void uniqueCharacters1(String str) {
        String uniques = "";

        ArrayList<String> list= new ArrayList<>(Arrays.asList(str.split("")));


        for (String each : list) {
            int count = Collections.frequency(list, each);
            if (count == 1) {
                uniques += each;
            }
        }
        System.out.println(uniques);
    }

    private static void uniqueCharacters2(String str){
        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));

        ArrayList<String>uniques=new ArrayList<>();

        for (String each : list) {
            int count=Collections.frequency(list, each);
            if(count==1){
                uniques.add(each);
            }
        }
        System.out.println(uniques);
    }
}
