package day20_WhileLoops;

public class BranchingStatements {
    /*
    continue
    break
    System.exit()
     */
    public static void main(String[] args) {
        branchingStatements();
        exit();

    }

    private static void branchingStatements(){
        char ch = 'A';

        while (ch <= 'E') {
            if (ch == 'C') {
                ch++;
                continue;           // skips everything even the iterator
                //  break;
            }

            System.out.println(ch); // A B D E

            ch++;
        }

    }

    private static void exit(){
        /*
        if(true){
            System.out.println("Started");
            System.exit(0);
        }

        System.out.println("Done");

*/
        boolean a = true;
        while (a) {
            System.out.println("Test started");
            //break;
            System.exit(0);
        }
        System.out.println("Completed");
    }
}
