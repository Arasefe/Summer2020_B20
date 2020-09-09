package day51_Exceptions.exceptions;

public class ExceptionHandling4 {
    public static void main(String[] args) {
        try{
            throwingAnException();
        }catch (Exception e){
            e.getMessage();
        }


    }

    public static void throwingAnException() throws Exception{
        throw new Exception();

    }
    public static void throwingAnException1() throws Exception{

        throw new Exception("OH my God!");
    }
    public static void throwingAnException2() throws RuntimeException{
        throw new RuntimeException();

    }

    public static void throwingAnException3() throws RuntimeException{
        throw new RuntimeException("Ohh well I fell.");

    }
}
