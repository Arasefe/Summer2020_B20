package day31_Recap;

public class _4Methods_Practice {

    public static void main(String[] args) {
        // int a = 3000000;
        max1(10, 12);

        // System.out.println( max(10,20) * 30  );

        int b = max2(10, 20);

        System.out.println(max2(10, 20));

        System.out.println(max2(10, 20) * 30);


    }


    public static void max1(int a, int b) {
        if(a==b){
            System.out.println("Equal parameters!");
            return;
        }
        int max = (a > b) ? a : b;
        System.out.println(max);
    }


    public static int max2(int a, int b) {
        if(a==b){
            System.out.println("Equal parameters!");
        }
        return (a > b) ? a : b;
    }


}
