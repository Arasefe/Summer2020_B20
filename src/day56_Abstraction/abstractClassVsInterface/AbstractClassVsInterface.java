package day56_Abstraction.abstractClassVsInterface;

public abstract class AbstractClassVsInterface {
    private int a;
    static int b;
    protected short c;
    public byte d;

    public void method1() {                              // regular method

    }

    public static void method2() {                       // static method

    }

    public abstract void method3();                     // abstract method


    static {
        b = 300;
    }                                         //  static block

    {
        a = 25;
    }                                               // instance block

    public AbstractClassVsInterface(int a) {             // Constructor
        this.a = a;
    }

}


interface A {
    int a = 10;                                           // public static final Assumed keywords


    public static void method1() {                       // static method

    }

    public void method2();                              // abstract method without assumed keyword of abstract


    public abstract void method3();                     // abstract method without default keyword


    public default void method4() {
        System.out.println("Default method in interface must have body");
    }


    default void method5() {
        System.out.println("Default method in interface can be without assumed keyword");
    }


}
