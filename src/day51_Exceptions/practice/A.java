package day51_Exceptions.practice;

public class A {
    int a=5;
    int b=6;
    public void print1(){
        System.out.println("Printing "+this.a);
    }
    public void print2(){
        System.out.println("Printing "+this.b);
    }
}
class B extends A{
    int a=10;
    int b=12;
    @Override
    public void print1() {
        System.out.println("Printing from subclass "+this.a);
    }

    @Override
    public void print2() {
        System.out.println("Printing from subclass "+super.b);
    }

    public static void main(String[] args) {
        B b=new B();
        b.print1();
        b.print2();
    }
}
