package day52_Exceptions.exception;

public class ThrowKeyword1 {
    public static void main(String[] args) {
        try {
            method1(3);
        }catch (InterruptedException e){

        }
        method2(5);
    }


    public static void method1(int seconds) throws InterruptedException{
        Thread.sleep(seconds*1000);
    }

    public static void method2(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            System.out.println();
        }
    }

    public static void method3() throws InterruptedException{
        method1(8);
    }


    public static void method4(){

        try{
            method1(5);
        }catch (InterruptedException e){
            System.out.println("Interrupted Exception handled");
        }
    }
}
