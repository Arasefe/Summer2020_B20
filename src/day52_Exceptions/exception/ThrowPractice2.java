package day52_Exceptions.exception;

import java.time.LocalTime;

public class ThrowPractice2 {
    public static void main(String[] args) {

        if(LocalTime.now().getMinute()==45){
            throw new RuntimeException("Break time");
        }else{
            System.out.println("The class is ongoing....");
        }
    }
}
