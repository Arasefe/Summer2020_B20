package day18_ForLoop;

import java.util.Scanner;

public class EmailDomain {
    static Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {
        extractEmailDomain();

    }
    private static void extractEmailDomain(){
        System.out.println("Please enter your email:");
        String email = scan.next();

        //              012345678
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");


        String domain = email.substring(index1 + 1, index2);  //"gmail"

        System.out.println(domain);

    }

}
