package day52_Exceptions.exception;

public class MultiCatchBlock2 {
    public static void main(String[] args) {
        multiCatchMethod("Cybertek");
    }
    public static void multiCatchMethod(String str){
        try{
            System.out.println(str.charAt(9));
        }catch (ClassCastException e){
            System.out.println("Class Cast");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bounds");
        }catch (RuntimeException e){
            System.out.println("Runt time Exception");
        }
    }
}
