package day51_Exceptions.exceptions;

public class CheckedException_Practice1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
        }
        System.out.println();
    }


    public void sleep(int second){
        try{
            Thread.sleep(second*1000);
        }catch (InterruptedException e){

        }

    }
}
