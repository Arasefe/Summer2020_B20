package day41_toStringPractice.carpet;


import day41_toStringPractice.carpet.Carpet;

public class PrintClassObjects {

    public static void main(String[] args) {

        Carpet c1 = new Carpet();
        c1.customOrder(5,6,19, true);
        System.out.println(c1);
        c1.getCarpetInfo();


    }
}
