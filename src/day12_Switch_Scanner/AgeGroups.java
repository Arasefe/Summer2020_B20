package day12_Switch_Scanner;
/*
  2. write a program that can define the age groups of a person
            age groups are:
                    Children    (<=14 )
                    Youth       (15<= age <=24)
                    Adult       (>=25 && <=64 )
                    Senior      ( <= 90 )
                    Un-defined  (0 > age> 90 )

                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
 */

public class AgeGroups {
    public static void main(String[] args) {
        ageGroups1(-1);
        ageGroups2(-1);


    }

    private static void ageGroups1(int age) {
        String ageGroup = "";

        ageGroup = (age >= 0 && age <=14) ? "Children" : (age <= 24) ? "Youth" : (age <= 64) ? "Adult" : (age <= 90) ? "Senior" : "Not Defined";


        System.out.println(ageGroup);

    }

    private static void ageGroups2(int age) {
        String ageGroup = "";

        if (age >= 0 && age <= 14) {            // age <= 14
            ageGroup = "Children";
        } else if (age <= 24) {                 // age <= 24
            ageGroup = "Teenager";
        } else if (age <= 64) {                 // age <= 64
            ageGroup = "Adult";
        } else if (age <= 90) {                 // age <= 90
            ageGroup = "Senior";
        } else {
            ageGroup = "Not Defined";
        }

        System.out.println(ageGroup);
    }

}
