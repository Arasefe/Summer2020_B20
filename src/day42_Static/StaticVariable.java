package day42_Static;

class Test {

    int a;
    static int b;


}

public class StaticVariable {

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.a = 5;
        obj1.b = 20;
        System.out.println(obj1.a);     // 5
        System.out.println(obj1.b);     // 20

        Test obj2 = new Test();
        obj2.a = 10;
        obj2.b = 30;
        System.out.println(obj2.a);     // 10
        System.out.println(obj2.b);     // 30

        Test obj3 = new Test();
        obj3.a = 8;
        obj3.b = 25;
        System.out.println(obj3.a);     // 8
        System.out.println(obj3.b);     // 25


        System.out.println(obj1.b);     // 25
        System.out.println(obj2.b);     // 25
        System.out.println(obj3.b);     // 25


    }


}