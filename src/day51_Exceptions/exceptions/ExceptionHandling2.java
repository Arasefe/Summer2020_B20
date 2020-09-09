package day51_Exceptions.exceptions;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        exceptionHandling(10, 0);
    }

    public static void exceptionHandling(int a, int b) {
        try {
            System.out.println("Try block");
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception detected");
            System.out.println(e.getMessage());

        } catch (RuntimeException r) {
            System.out.println("Runtime Exception detected");
            System.out.println(r.getMessage());

        } finally {
            System.out.println("Finally Block");
        }

    }
}
