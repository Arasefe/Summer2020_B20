package day26_MultiDimensionalArray;

import java.util.Arrays;

public class _4MultiDArrayPractice {
    /*
            Testers: {"Richard", "Muthu", "Sam", "Luis" }
            Developers: {"Aidan", "Travis", "Daniel", "Sarah"}
            SM: {"Andrew"}
            PO: {"Christy"}
            BA: {"Alex"}

            scrumTeam:  testers, Developer, SM, PO, BA
     */

    public static void main(String[] args) {
        String[] testers = {"Richard", "Muthu", "Sam", "Luis"};
        String[] developers = {"Aidan", "Travis", "Daniel", "Mathew"};
        String[] SM = {"Andrew"};
        String[] PO = {"Christy"};
        String[] BA = {"Alex"};

        String[] testers2 = {"Todd", "Thiago", "Sam"};

        String[][] scrumTeam = {testers, developers, SM, PO, BA};
        //                          0          1     2   3   4

        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[4][0] = "Adam";
        scrumTeam[1][2] = "Emine";
        scrumTeam[0] = testers2;
        scrumTeam[3][0] = "Zeki";
        System.out.println(Arrays.deepToString(scrumTeam));
        for (String[] each : scrumTeam) {
            for (String name : each) {
                System.out.println(name);
            }
            // System.out.println( Arrays.toString(each) );
        }

        System.out.println("=======================================================================");

        int[][] scores = {{10, 20, 30, 45}, {60, 55, 75, 105}, {93, 48, 125, 135, 13}};
        //                      0                    1                  2
        // print out the numbers that are divisible by 3 or 5

        for (int[] oneDArray : scores) {
            for (int each : oneDArray) {
                if (each % 3 == 0 || each % 5 == 0) {
                    System.out.print(each + " ");
                }
            }
        }

        System.out.println();

        int[][] a1 = {{1, 2}, {3, 4, 5}};
        int[][] a2 = {{6, 7}, {8, 9, 10}};

        int[][][] arr3D = {{{1, 2}, {3, 4, 5}}, {{6, 7}, {8, 9, 10}}};
        //                           0                      1


    }


}
