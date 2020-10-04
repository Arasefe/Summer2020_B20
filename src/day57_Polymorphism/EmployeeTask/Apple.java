package day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {
    public static void main(String[] args) {
        Employee tester1= new Tester("Aras", 238642, "QA", 123000, 'M');
        Employee tester2 = new Tester("Tulpar", 47378492, "Analyst", 134000, 'M');
        Employee developer1 = new Developer("Banu", 4675733, "SDET", 113000, 'F');
        Employee developer2 = new Developer("Ismail", 916736212, "QA", 102000, 'M');

        Employee scrumMaster=new ScrumMaster("Omer",238723762,"Scrum Master",109000,'M');

        ArrayList<Employee>scrumTeam=new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester2,developer1,developer2, scrumMaster));

        for(Employee each:scrumTeam){
            System.out.println(each);
        }
    }
}
