package day08_LogicalOperators;

public class Odd_Even {

    public static void main(String[] args) {
        int number = 999999;

        oddEven(number);

    }
    public static void oddEven(int number){
        boolean even = number % 2 ==0;
        boolean odd = number % 2 ==1;

        if(even){
            System.out.println(number+" is even number");
        }

        if(odd){
            System.out.println(number+" is odd number");
        }
    }

}
