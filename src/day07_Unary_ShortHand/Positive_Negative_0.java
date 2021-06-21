package day07_Unary_ShortHand;

public class Positive_Negative_0 {

    public static void main(String[] args) {


        isPositiveNegative(1);


    }

    public static void isPositiveNegative(int num){
        boolean isPositive = num > 0;
        boolean isNegative = num < 0;
        boolean isZero =   num == 0;

        System.out.println(num +" is positive? "+isPositive );
        System.out.println(num +" is negative? "+isNegative);
        System.out.println(num + " is Zero? " + isZero);

    }

}
