package day43_Static;

public class _5StaticBlock {
    static int a=3;

    public _5StaticBlock(){
        System.out.println("Constructor");
    }


    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        System.out.println("Static block "+a);
    }


}
