package day43_Static;

import day42_Static.scrumTeam.Tester;

public class _6StaticBlock2 {

    static int a;
    static String b;
    static Tester tester1;
    static Tester tester2;


    static {
        a = 100;
        b = "Aras";
        tester1 = new Tester();
        tester1.setInfo("Ahmet", 'M', 123, "SDET", 10000);

        tester2 = new Tester();
        tester2.setInfo("Ramazan", 'M', 124, "SDET", 10000);

    }

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);

    }


}
