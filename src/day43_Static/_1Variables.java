package day43_Static;

public class _1Variables {
    /*
        Instance variables are the variables owned by the Object
        They do not have to be initialized as soon as they are declared
        They have default values if they do not initialized
        They do have all access modifiers
        They have multiple copies

        Static variables are the variables owned by the Class
        They do not have to be initialized as soon as they are declared
        They have default values if they do not initialized
        They do have all access modifiers
        They have only one copy and once the static variable is used in one Object it is updated
         */
    int d;
    static int s;

    public void method2() {
        System.out.println(d);
        System.out.println(s);
    }


    public static void main(String[] args) {
        // System.out.println(d);
        System.out.println(s);

        //   System.out.println(d);  -- static ONLY accepts static --

        _1Variables obj = new _1Variables();
        System.out.println(obj.d);


    }

    public static void method1() {
        /*
        Local variables are the variables used in method
        They have to be initialized as soon as they are declared
        They do not have any access modifier
        Their scope is only the method or code of block they are created
         */
        int a;

        if (true) {
            int b = 20;
        }

        // System.out.println(b);

        //   System.out.println(a);

    }


}