package day51_Exceptions.superKeyword;


class C{
    public C(int a){
        System.out.println("Super class's int arg constructor");
    }
}


public class SuperKeyword3 extends C{

    public SuperKeyword3(int a){
        super(3);
        System.out.println("Sub class's constructor with int arg");

    }

    public static void main(String[] args) {
        new SuperKeyword3(3);
    }
}
