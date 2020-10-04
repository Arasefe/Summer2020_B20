package day53_finalKeyword.finalKeyword;


import java.time.LocalDate;

public class FinalVariable {
    final static String eyeColor="Brown";
    final String bloodType="B+";

    public static void main(String[] args) {
        final LocalDate dateOfBirth= LocalDate.of(1977,1,1);
        //dateOfBirth=LocalDate.of(1978,2,3);
        System.out.println(dateOfBirth);

        final long ssn=438623482;
        //ssn=3287237;
        System.out.println(ssn);

        final double PI=3.14;
        //PI=3.24;
        System.out.println(PI);

        final char gender='M';
        System.out.println(gender);

        final String birthPlace="USA";
        System.out.println(birthPlace);

    }
}
