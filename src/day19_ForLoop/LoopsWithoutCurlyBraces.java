package day19_ForLoop;

public class LoopsWithoutCurlyBraces {

    public static void main(String[] args) {

        for (int i = 5; i < 10; i++) {
            System.out.println("Hello");
            System.out.println("How are you");
        }
        loopsWithoutCurlyBraces();
    }

    private static void loopsWithoutCurlyBraces() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Hello");
        System.out.println("How are you");
    }

}
