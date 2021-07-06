package day20_WhileLoops;
/*
    3. write a program that can remove the duplicates from any given String
            Ex:
            input: abcabcaabb
            output: abc
 */

import java.util.Scanner;

public class RemoveDuplicates {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //removeDuplicates1();
        removeDuplicates2();
    }

    private static void removeDuplicates1(){
        System.out.println("Please enter the String: ");
        String str = scan.nextLine();


        String result = "";                 // "abcdefghi"

        /*
        for(int i = 0; i <= str.length()-1; i++  ){

              String s =  ""+str.charAt(i); // a, a, b, b

                if( result.contains(s) ){   // if the character is already contained in result, wre will not add it again
                   continue;
                }

                result += s;

        }
    */

        for(int i = 0; i <= str.length()-1; i++  ){

            //String s =  ""+str.charAt(i);  //a,  b,  a,  b
            String s = str.substring(i, i+1);

            if( !result.contains(s) ){
                result += s;
            }

        }

        System.out.println(result);

    }

    private static void removeDuplicates2(){
        System.out.println("Please enter the String: ");
        String str=scan.next();
        String unique="";
        for (int i = 0; i <str.length(); i++) {
            if(unique.contains(""+str.charAt(i))){
                continue;
            }
            unique+=str.charAt(i);
        }
        System.out.println(unique);
    }

}
