package day41_toStringPractice.multiclass;

public class OuterClass {
    public static void main(String[] args) {
        System.out.println("Outer class");
    }

    static class InnerClass{
        public static void main(String[] args) {
            System.out.println("Inner class");
        }
    }
}
