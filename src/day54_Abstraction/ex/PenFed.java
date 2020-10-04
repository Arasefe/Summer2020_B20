package day54_Abstraction.ex;

import java.time.LocalDate;

public class PenFed {
    public static void main(String[] args) {
        Tester tester1=new Tester("Aras",'M', LocalDate.of(2014,9,13),"QA",123000);
        tester1.salary=134000;
        tester1.jobTitle="BA";

        System.out.println(tester1.gender);
        System.out.println(tester1.dOfb);


        Developer developer=new Developer("Tulpar",'M',LocalDate.of(2016,06,17),"SM",10000);










    }
}
