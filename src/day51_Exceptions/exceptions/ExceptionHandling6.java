package day51_Exceptions.exceptions;

public class ExceptionHandling6 {
    public static void main(String[] args) {
        new DoSth().go();
        System.out.println("G");
    }
}
class DoSth{
    public void go(){
        System.out.println("A");                    // 1. A

        try{
            stop();
        }catch (ArithmeticException e){
            System.out.println("B");
        }finally{
            System.out.println("C");                // 3. C
        }
        System.out.println("D");
    }
    public void stop(){
        System.out.println("E");                    // 2.E
        Object x=null;
        x.toString();
        System.out.println("F");
    }
}
