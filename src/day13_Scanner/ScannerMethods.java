package day13_Scanner;

import java.util.Scanner;

public class ScannerMethods {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        byteMethod();
    }

    private static void byteMethod(){
        System.out.println("Your Car has 4 doors");
        byte result =    scan.nextByte();

        System.out.println(result);

    }
    private static void shortMethod(){
        System.out.println("Your Car has 4 doors");
        short result =    scan.nextShort();

        System.out.println(result);

    }
    private static void intMethod(){
        System.out.println("Your Car has 4 doors");
        int result =    scan.nextInt();

        System.out.println(result);

    }
    private static void longMethod(){
        System.out.println("Your Car has 4 doors");
        long result =    scan.nextLong();

        System.out.println(result);

    }
    private static void floatDoubleMethod(){
        System.out.println("Your Car has 4 doors");
        float result = scan.nextFloat();
        System.out.println(result);

        double result1 = scan.nextDouble();
        System.out.println(result1);

    }
    private static void stringMethod(){
        System.out.println("Your Car has 4 doors");
        String result =    scan.nextLine();
        System.out.println(result);

    }
    private static void booleanMethod(){
        System.out.println("Your Car has 4 doors");
        boolean result =    scan.nextBoolean();

        System.out.println(result);

    }



}
