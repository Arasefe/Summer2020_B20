package day52_Exceptions.exception;

public class FinallyBlock1 {
    public static void main(String[] args) {
        finallyMethod(3,0);
        System.out.println("Main method");

    }
    public static void finallyMethod(int a, int b){
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");

        }catch(RuntimeException e){
            System.out.println("Runtime exception");

        }finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Completed");
    }
}
