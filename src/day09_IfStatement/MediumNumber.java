package day09_IfStatement;

public class MediumNumber {

    public static void main(String[] args) {
        mediumNumber(5, 4, 6);

    }

    public static void mediumNumber(double a, double b, double c) {

        boolean aIsMed = (a > b && a < c) || (a > c && a < b);
        boolean bIsMed = (b > c && b < a) || (b < c && b > a);

        boolean cIsMed = !aIsMed && !bIsMed;

        double med = 0;

        if (aIsMed) {
            med = a;
        }

        if (bIsMed) {
            med = b;
        }

        if (cIsMed) {
            med = c;
        }

        System.out.println(med + " is the medium number");

    }

}
