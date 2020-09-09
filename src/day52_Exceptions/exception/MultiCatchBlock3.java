package day52_Exceptions.exception;

public class MultiCatchBlock3 {
    public static void main(String[] args) {
        multiBlockMethod("Aras");
        System.out.println("This is from main method");
    }

    public static void multiBlockMethod(String str) {
        try {
            System.out.println(str.charAt(8));
        } catch (RuntimeException e) {          // Exception class works as well
            System.out.println("Exception class is initiated");
        }finally{
            System.out.println("Finally block is run");
        }
    }
}
