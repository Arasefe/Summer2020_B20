package day11_NestedIf_Ternary;
/*
 Task01:    Mortgage application conditions
            precondition: minimum salary of 30k
                sub condition: minimum 2 years of job constant pay in the same company
 */

public class NestedIf_Practice1 {

    public static void main(String[] args) {
        salaryQualification2(20000,3);

    }
    private static void salaryQualification1(double salary, int jobHistory){

        if(salary >= 30000){        // salary >= 30000
            if(jobHistory >= 2){
                System.out.println("You are qualified");
            }else{                  // jobHistory < 2
                System.out.println("You must have been on job at least 2 year");
            }

        }else{
            System.out.println("You MUST earn at least $30K");
        }
    }

    private static void salaryQualification2(double salary, int jobHistory){

        String result="";
        result= (salary>=30000)?(jobHistory>2)?"Qualified":"Unqualified":(jobHistory<2)?"Job History must acceed 2":"salary must be more than 30000";
        //(n1 >= n2) ? ((n1 >=n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println(result);

    }

    private static void largestNumber(int n1, int n2, int n3){
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);

    }


}
