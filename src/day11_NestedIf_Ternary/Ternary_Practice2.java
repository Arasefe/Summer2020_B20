package day11_NestedIf_Ternary;

public class Ternary_Practice2 {
    // ?  means if, : else  :? Else if

    public static void main(String[] args) {
        multiBranchTernary1(100);
        multiBranchTernary2(12,13);

    }

    private static void multiBranchTernary1(int num){

        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }

        String result2 =  (num > 0) ? "Positive" : (num < 0)  ? "Negative" : "Zero";

        System.out.println(result);
        System.out.println(result2);

    }

    private static void multiBranchTernary2(int a, int b){
        /*
            write a program that can compare two number
                a = 10, b= 20
               output:  b is greater

               a = 30, b = 10;
               output: a is greater

               a = 20; b= 20;
               output: a is equal to b

         */
        a = 20;
        b = 20;

        String r =  (a> b) ? a+" is greater" :(b > a)? b+" is greater" : a+" is equal to "+b;

        System.out.println(r);

    }


}
