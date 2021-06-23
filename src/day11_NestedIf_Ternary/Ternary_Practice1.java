package day11_NestedIf_Ternary;

public class Ternary_Practice1 {
    // second task: "can vote" or "Cannot vote"
    // third task: write a program that can check if two numbers are equal or not.


    public static void main(String[] args) {

        ternaryPractice(16);
        ternaryPractice(23,9);


    }

    private static void ternaryPractice(int age){

        String citizen = "USA";

        String result = "";

        if(age >= 18 && citizen == "USA"){
            result = "Can Vote";
        }else{
            result = "Can Not Vote";
        }

        System.out.println(result);

        String result2 = (age >= 18 && citizen == "USA") ? "Can Vote" : "Can Not Vote";
        System.out.println(result2);

    }

    private static void ternaryPractice(int n1, int n2){

        String r = (n1 == n2) ? "Equal" : "Not Equal" ;
        // "equal" or "not equal"

        System.out.println(r);
    }

}
