package day19_ForLoop;
/*
Warmup tasks:
    1. Write a method which prints out the numbers from 1 to 100
    if numbers are multiplied by both 3 and 5, print "FINRA" instead of the number,
    if numbers are multiplied by 3, print "FIN" instead of the number and
    if numbers are multiplied by 5, print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ....
 */

public class FINRA {

    public static void main(String[] args) {
        //finRa1();
        finRa2();

    }

    private static void finRa1(){
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {     // if num is divisible by 3 & 5 both
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {            // if the num is ONLy divisible by 3
                System.out.print("FIN ");
            } else if (i % 5 == 0) {            //if the num is ONLy divisible by 5
                System.out.print("RA ");
            } else {                            // otherwise
                System.out.print(i + " ");
            }

        }

    }

    private static void finRa2(){
        String result="";
        for (int i = 1; i <=100; i++) {
        result=(i%3==0&&i%5==0)?"FINRA":(i%3==0)?"FIN":(i%5==0)?"RA":""+i;
        System.out.print(result+" ");
        }

    }

}
