package day22_NestedLoop;

public class FiveStars {
    /*
     *******
     *******
     *******
     *******
     */

    public static void main(String[] args) {
        //fiveStars1();
        fiveStars2();

    }


    private static void fiveStars1(){
        int j = 1;
        while(j<= 4){

            for(int i = 1; i <= 10; i++){
                System.out.print("*");
            }
            System.out.println();

            j++;
        }

    }

    private static void fiveStars2(){
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
