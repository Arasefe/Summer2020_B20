package day52_Exceptions.exception;

public class MultiCatchBlock1 {
    public static void main(String[] args) {
        int[]arr={10,20};

        try{
            System.out.println(arr[2]);

        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception is handled");

        }catch(ClassCastException e){
            System.out.println("ClassCastException is handled");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException is handled");

        }catch (RuntimeException e){
            System.out.println("Run time exception handled");
        }

        finally {
            System.out.println("Finally block is handled");
        }
    }
}
