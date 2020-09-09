package day52_Exceptions.exception;

public class TryCatch {
    public static void main(String[] args) {
       calculate(4,0);
    }

    public static void calculate(int a, int b){
        try{
            System.out.println(a/b);                    // this statement does not appear
            System.out.println("Try block");            // this statement does not appear
        }catch (ArithmeticException e){
            System.out.println("Task completed");
        }
    }
}
