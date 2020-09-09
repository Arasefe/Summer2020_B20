package day51_Exceptions.exceptions;



import java.io.FileNotFoundException;
import java.util.Arrays;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        try{
            System.out.println("Try block");
            fall();
        }catch(Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }finally {
            System.out.println("Finally block");
        }
    }


    public static void fall() throws Exception{            // Checked Exception
        throw new FileNotFoundException();
    }
}
