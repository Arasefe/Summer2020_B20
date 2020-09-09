package day51_Exceptions.exceptions;

import java.util.ArrayList;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        System.out.println("Step 1");
        ArrayList<Integer> list = new ArrayList<>();

        String exceptionMessage="";
        try {
            System.out.println(list.get(1));
        } catch (IndexOutOfBoundsException e) {
            exceptionMessage=e.getMessage();
        }
        System.out.println("Next 2");
        System.out.println(exceptionMessage);
    }
}