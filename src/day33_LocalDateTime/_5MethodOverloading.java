package day33_LocalDateTime;

public class _5MethodOverloading {


    public static void main(int[] kfc) {
        System.out.println("int array");
        main(new double[]{1.2,2.2,3.2,4.2});
    }


    public static void main(double[] arr) {
        System.out.println("double array");
    }


    static public void main(String[] m) {

        System.out.println("String array");
        int[] arr = {1, 2, 3};
        main(arr);
        /*
        println, substring, indexOf, replace, sort, toString, equals...
         */

    }


}
