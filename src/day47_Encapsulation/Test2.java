package day47_Encapsulation;

public class Test2 {
    static int a=200;
    

    static{
        a=300;
        System.out.println(a);
    }
    public Test2(){
        a=400;
        System.out.println(a);
    }

    public static void main(String[] args) {
       //System.out.println(a);
        //new Test2();
        a=600;

        System.out.println(a);

    }
}
