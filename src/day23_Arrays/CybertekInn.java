package day23_Arrays;
/*
 2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            Single Bed ==> 80$

 the program asks the user which bedroom does he/she wants to reserve and calculates the total price, and then the program will ask:
 do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter

            HINT: nested loop task, outer loop need to be an infinite loop

 */

import java.util.Scanner;

public class CybertekInn {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //reservation1();
        reservation2();
    }

    private static void reservation1() {

        int total = 0;
        System.out.println("Welcome to Cybertek Inn");

        while (true) {

            System.out.println("Please choose from the following: ");
            System.out.println("1. King Bed: $120");
            System.out.println("2. Queen Bed: $100");
            System.out.println("3. Single Bed: $80");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;

                default:
                    System.out.println("Get Out");
                    System.exit(0);
            }

            System.out.println("Do you want to reserve another room?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {      // while the answer is invalid
                System.out.println("Invalid, Please re-enter");
                System.out.println("do you want to reserve another room?");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")) {
                break;
            }

        }

        System.out.println("Your total price is: $" + total);


    }

    private static void reservation2(){
        int total = 0;
        String answer="";
        System.out.println("Welcome to Cybertek Inn");

        do {
            System.out.println("Please choose from the following:\n"+
            "1. King Bed: $120\n"+
            "2. Queen Bed: $100\n"+
            "3. Single Bed: $80");
            int option = scan.nextInt();

            if(!(option==1||option==2||option==3)){
                System.out.println("Please enter a valid option");
            }
            switch (option){
                case 1:
                    total+=120;
                    break;
                case 2:
                    total+=100;
                    break;
                case 3:
                    total+=80;
                    break;
                default:
                    System.out.println("Not valid option");
            }
            System.out.println("Do you want to continue reservation? ");
            answer=scan.next();
            if(answer.equalsIgnoreCase("No")) {
                System.out.println("Thank you for choosing CybertekInn. Your total is " + total);
            }

        }while(answer.equalsIgnoreCase("yes"));
    }

}
