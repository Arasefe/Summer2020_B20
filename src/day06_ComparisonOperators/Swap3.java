package day06_ComparisonOperators;

public class Swap3 {
    public static void main(String[] args) {
        swap();
    }
    public static void swap(){
        int a=3;
        int b=5;
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
