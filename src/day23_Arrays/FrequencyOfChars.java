package day23_Arrays;

import java.util.Scanner;

public class FrequencyOfChars {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //frequencyOfChars1();
        frequencyOfChars2();
    }

    private static void frequencyOfChars1(){

        String str = scan.next();
        String nonDup = "";                         //"BCD"

        for(int i =0; i <= str.length()-1; i++){    // remove duplicates from str and added to nonDup
            String ch = ""+ str.charAt(i);          // B, B, C, C, D, D

            if(nonDup.contains(ch)){
                continue;
            }else{
                nonDup += ch;
            }

        }

        String expectedResult = "";                 //"B2C2D2"

        // str = "BBCCDD"      nonDup = "BCD"    ===> "B2C2D2"

        for(int j=0; j <= nonDup.length()-1; j++){  // iterates the string nonDup

            char ch = nonDup.charAt(j);             // B, C, D   every single characters from nonDup
            int count = 0;                          // 2,  2,   2    frequency of every single ch

            for(int i=0; i <= str.length()-1; i++){ // returns the frequency of each ch from string str
                if(str.charAt(i) == ch){
                    count++;
                }
            }

            expectedResult += ""+ch + count;

        }

        System.out.println(expectedResult);


        /*
        the reason we need nested loop:

         char ch1 = nonDup.charAt(0);  //B
            int count1 = 0; // frequency of B
            for(int i=0; i <= str.length()-1; i++){  // returns the frequency of each ch from string str
                if(str.charAt(i) == ch1){
                    count1++;
                }
            }

            expectedResult += ""+ch1 + count1;


             char ch2 = nonDup.charAt(0);  //C
            int count2 = 0; // frequency of C
            for(int i=0; i <= str.length()-1; i++){  // returns the frequency of each ch from string str
                if(str.charAt(i) == ch2){
                    count2++;
                }
            }

            expectedResult += ""+ch2 + count2;


             char ch3 = nonDup.charAt(0);  //D
            int count3 = 0; // frequency of D
            for(int i=0; i <= str.length()-1; i++){  // returns the frequency of each ch from string str
                if(str.charAt(i) == ch3){
                    count3++;
                }
            }

            expectedResult += ""+ch3 + count3;

         */
    }
    private static void frequencyOfChars2() {
        String str = scan.next();
        String nonDup = "";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }

        for (int i = 0; i <nonDup.length() ; i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(nonDup.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            result+=nonDup.charAt(i)+""+count+" ";
        }

        System.out.println(result);

    }


}
