package day51_Exceptions.superKeyword;


class Test{
    int a;
    int b;
    public void print1(){
        System.out.println("Printing "+a);
    }
    public void print2(){
        System.out.println("Printing "+b);
    }
}

public class SuperKeyword extends Test {
    int a=400;
    int b=500;
    public void print1(){
        System.out.println("Printing "+super.a);

    }
    public void print2(){
        System.out.println("Printing "+super.a);
    }

    public static void main(String[] args) {
        Test obj1=new Test();
        obj1.a=200;
        obj1.b=300;
        obj1.print1();
        obj1.print2();
        SuperKeyword obj2=new SuperKeyword();
        obj2.a=3;
        obj2.b=5;

        obj2.print1();
        obj2.print2();

    }

}
