package day22_NestedLoop;

public class WhyNestedLoopNeeded {

    public static void main(String[] args) {
        //whyNestedLoopNeeded();
        nestedLoop();

    }

    private static void whyNestedLoopNeeded() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


    }

    private static void nestedLoop() {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }

}
