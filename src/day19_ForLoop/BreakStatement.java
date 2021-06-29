package day19_ForLoop;

public class BreakStatement {

    public static void main(String[] args) {
        breakStatement1();
        breakStatement2();
        breakStatement3();
        breakStatement4();

    }

    private static void breakStatement1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");            // Hello
            break;
        }
    }

    private static void breakStatement2() {
        for (char ch = 'A'; ch <= 'H'; ch++) {      // ch: A  B C

            if (ch == 'C') {
                break;
            }

            System.out.print(ch + " ");             //A B

        }

        System.out.println();

    }

    private static void breakStatement3() {

        for (int i = 10; i <= 50; i += 10) {        // i: 10, 20, 30, 40, 50

            if (i == 30) {
                break;
            }

            System.out.print(i + " ");              // 10 20

        }
    }

    private static void breakStatement4() {

        for (int x = 1000; x >= 100; x -= 100) {    // x: 1000, 900, 800, 700, 600, 500, 400, 300, 200, 100

            System.out.print(x + " ");              // 1000, 900, 800, 700, 600, 500

            if (x == 500) {
                break;                              // exits the loop
            }

        }
    }
}
