package day09_IfStatement;

public class Minimum {

    public static void main(String[] args) {
        minNumber(3, 5, 7);
    }

    public static void minNumber(double a, double b, double c) {

        boolean aIsMin = a < b && a < c;

        boolean bIsMin = aIsMin == false && b < c;
        // b < a && b < c

        boolean cIsMin = aIsMin == false && bIsMin == false;
        // c < a && c < b;

        double min = 0;

        if (aIsMin) {
            min = a;
        }

        if (bIsMin) {
            min = b;
        }

        if (cIsMin) {
            min = c;
        }

        System.out.println(min + " is the minimum number");


    }

}
