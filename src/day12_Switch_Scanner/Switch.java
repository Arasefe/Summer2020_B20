package day12_Switch_Scanner;

public class Switch {

    public static void main(String[] args) {
        switchMethod(3);

    }

    private static void switchMethod(int num) {


        switch (num) {

            case 5:
                System.out.println("Five");
                break;

            case 1:
                System.out.println("One");
                break;

            default:
                System.out.println("Invalid Case");

        }
    }
}


