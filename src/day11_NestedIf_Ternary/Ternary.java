package day11_NestedIf_Ternary;

public class Ternary {

    public static void main(String[] args) {
        // second task: "can vote" or "Cannot vote"
        // third task: write a program that can check if two numbers are equal or not.
        ifToTernary1(223);
        ifToTernary2(3,5);
        ifToTernary3(34);


    }

    private static void ifToTernary1(int num){

        String result = "";

        if(num % 2 == 0){
            result = "Even";
        }else{
            result = "Odd";
        }

        System.out.println(result);

        System.out.println("================================================");

        String result2 = (num % 2 == 0) ? "Even" : "Odd" ;

        System.out.println(result2);
    }

    private static void ifToTernary2(int num1, int num2){

        int max = 0;

        if(num1 > num2){
            max = num1;
        }else{
            max = num2;
        }

        System.out.println(max);

        System.out.println("================================================");

        max =  (num1 > num2) ? num1 : num2;
        System.out.println(max);

    }

    private static void ifToTernary3(int age){

        boolean eligible = false;

        if(age >= 21){
            eligible = true;
        }else{
            eligible = false;
        }

        System.out.println(eligible);
        // first task: convert the if statements above to ternary

        System.out.println("=================================================");

        boolean eligible2 = (age >= 21) ? true : false ;
        System.out.println(eligible2);


    }


}
