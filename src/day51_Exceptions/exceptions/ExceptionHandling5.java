package day51_Exceptions.exceptions;

public class ExceptionHandling5 {
    public static void main(String[] args) {
        new DoSomething().go();
        System.out.println("G");                    // 6. G
    }

}
class DoSomething{
    public void go(){
        System.out.println("A");                    // 1. A

        try{
            stop();
        }catch (NullPointerException e){
            System.out.println("B");                // 4. B
        }finally{
            System.out.println("C");                // 3. C
        }
        System.out.println("D");                    // 5. D
    }
    public void stop(){
        System.out.println("E");                    // 2.E
        Object x=null;
        x.toString();
        System.out.println("F");
    }
}
