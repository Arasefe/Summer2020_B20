package day43_Static;

import java.util.Arrays;

import static Library.Resources.a;   // only imports static variable a


public class Test {


    public static void main(String[] args) {
        System.out.println(_7StaticBlock3.a);
        System.out.println(_7StaticBlock3.b);
        System.out.println(_7StaticBlock3.c);

        System.out.println( Arrays.toString(Data.arr) );
        System.out.println(Data.list);

        System.out.println("====================================");

        System.out.println(a);


    }

}
