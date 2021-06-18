package day06_ComparisonOperators;

public class Swap1 {

    public static void main(String[] args) {
        int a = 20;
        int b = 25;

        int c = 0; // This is the temporary variable
        c = a;
        a = b;
        b = c;


        System.out.println("a = "+a);  // 25
        System.out.println("b = "+b);  // 20

    }

}
