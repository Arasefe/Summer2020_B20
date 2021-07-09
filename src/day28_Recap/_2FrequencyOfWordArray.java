package day28_Recap;
/*
 2. write a program that can count the frequency of a word from an array of string
            Ex:
                arr: {"Java", "C#", "Python", "Java"};
                word: "java"

                output:
                        2
            MUST USE for each loop and continue statement
 */

public class _2FrequencyOfWordArray {

    public static void main(String[] args) {
        frequencyOfWord1();
        frequencyOfWord2();

    }
    private static void frequencyOfWord1(){
        String[] arr = {"Java", "C#", "Python", "Java", "jAvA"};
        String word = "java";

        int count = 0;
        for(String each  : arr  ){
            if(!word.equalsIgnoreCase(each)){
                continue;
            }
            count++;
        }

        System.out.println(count);
    }

    private static void frequencyOfWord2(){
        String[] arr = {"Java", "C#", "Python", "Java", "jAvA"};
        String word = "java";

        int count = 0;
        for(String each  : arr  ){
            if(word.equalsIgnoreCase(each)){
                count++;
            }
        }
        System.out.println(count);
    }

}
