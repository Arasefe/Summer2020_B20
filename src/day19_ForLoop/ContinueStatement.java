package day19_ForLoop;

public class ContinueStatement {

    public static void main(String[] args) {
        continueStatement();

    }

    private static void continueStatement(){
        for (int i = 1; i <= 5; i++) {          //i: 1, 2, 3, 4, 5

            if (i == 3) {
                continue;                       // jumps to the next iteration
            }

            System.out.print(i + " ");          // 1  2  4 5

        }


        for (char ch = 'A'; ch <= 'F'; ch++) {  // ch: A B C D E F

            if (ch == 'C' || ch == 'F') {
                continue;
            }

            System.out.print(ch + " ");         // ch: A B D E

        }

        System.out.println();
    }

}
