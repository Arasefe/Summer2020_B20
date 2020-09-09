package day51_Exceptions.exceptions;

public class ExceptionsIntro {
    public static void main(String[] args) {
        System.out.println("Test started");
        int []arr={1,2,3,4,5};
        //System.out.println(arr[9]);           // unchecked exceptions (unexpected event)

        //Thread.sleep(3000);                   // checked exceptions (unwanted event)

        String str="Cybertek";
        System.out.println(str.charAt(-1));
        System.out.println("Step");
    }
}
