package day43_Static;

public class _2StaticAndInstance {

    static int staticVariable;      // 1 copy
    int instanceVariable;           // 2 copies

    public static void main(String[] args) {

        _2StaticAndInstance obj1 = new _2StaticAndInstance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;
        System.out.println(obj1.staticVariable);    // 500

        _2StaticAndInstance obj2 = new _2StaticAndInstance();
        obj2.instanceVariable = 200;
        obj2.staticVariable = 400;

        System.out.println(obj1.instanceVariable);  // 100
        System.out.println(obj2.instanceVariable);  // 200

        System.out.println("===================================");

        System.out.println(obj1.staticVariable);    // 400
        System.out.println(obj2.staticVariable);    // 400


        System.out.println(_2StaticAndInstance.staticVariable); // prefer


    }

}
