package day52_Exceptions.exception;

public class ThrowKeyword2 {
    public static void main(String[] args) throws InterruptedException {
        m1();
        m2();
    }

    public static void m1() throws InterruptedException {
        Thread.sleep(3000);
    }

    public static void m2() throws InterruptedException {
        m1();
    }

    public static void m3() {
        try {
            m2();
        } catch (InterruptedException e) {
            System.out.println();
        }
    }

    public static void mainCaller() {
        try {
            main(new String[]{"Aras", "Tulpar"});
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception handled!!!");
        }
    }
}
