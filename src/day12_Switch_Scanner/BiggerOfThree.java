package day12_Switch_Scanner;
/*
  1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

            NOTE: DO NOT USE IF STATEMENT
 */

public class BiggerOfThree {

    public static void main(String[] args) {
        biggerOfThree1(3,4,5);
        biggerOfThree2(3,4,5);

    }

    private static void biggerOfThree1(int n1, int n2, int n3){

        boolean n1IsBigger = n1 > n2 && n1 > n3;
        boolean n2IsBigger = n2 > n1 && n2 > n3;

        boolean n3IsBigger = !n1IsBigger && !n2IsBigger;

        String result = (n1IsBigger) ? n1+" is biggest" :(n2IsBigger)? n2+" is biggest" : n3+" is biggest" ;
        System.out.println(result);
    }

    private static void biggerOfThree2(int n1, int n2, int n3){
        boolean n1IsBigger = n1 > n2 && n1 > n3;
        boolean n2IsBigger = n2 > n1 && n2 > n3;
        String result="";

        if(n1IsBigger){
            result += n1 + " is biggest";
        }else if(n2IsBigger){
            result += n2 + " is biggest";
        }else{                          //if n3 is the biggest number
            result += n3 + " is biggest";
        }

        System.out.println(result);
    }

}
