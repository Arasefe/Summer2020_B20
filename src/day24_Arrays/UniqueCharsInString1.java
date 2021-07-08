package day24_Arrays;
/*
 1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd
 */

public class UniqueCharsInString1 {


    public static void main(String[] args) {
        //uniqueLettersInString1();
        uniqueLettersInString2("aaabbbaadddcef");
    }

    private static void uniqueLettersInString1(){
        String str = "aaabbbaadddcef";
        String uniques = "";

        for(int i = 0; i <= str.length()-1; i++ ){

            char ch = str.charAt(i);           //   a  a  b  c  c
            int first = str.indexOf(ch);       //   0  0  2  3  3
            int last = str.lastIndexOf(ch);    //   1  1  2  4  4

            if(first == last){
                uniques += ch;
            }

        }


        System.out.println(uniques);

    }

    private static void uniqueLettersInString2(String str){
        String uniques="";
        for (int i = 0; i < str.length(); i++) {
            int fr=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    fr++;
                }
            }
            if(fr==1){
                uniques+=str.charAt(i);
            }
        }
        System.out.println(uniques);

    }

}
