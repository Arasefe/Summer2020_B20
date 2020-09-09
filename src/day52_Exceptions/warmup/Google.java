package day52_Exceptions.warmup;

import java.util.ArrayList;
import java.util.Arrays;

/*
4. create a class called Google
            create 5 objects of the Tester and 5 objects of Developer
            create an arrayList of Tester and an ArrayList of Developer, store those 5 objects of the Tester & Developers
            use for each loop to iterate Tester & Developer objects from in those arrayLists
                print out the tester & developer who has the highest salary
 */
public class Google {
    public static void main(String[] args) {
        Tester tester1=new Tester("Aras",23,'M',2937207,"SDET",130000);
        Tester tester2=new Tester("Efe",32,'M',7683286,"SDET",137000);
        Tester tester3=new Tester("Sinem",34,'F',94763702,"SDET",123000);
        Tester tester4=new Tester("Banu",38,'F',91293727,"Test Manager",156000);
        Tester tester5=new Tester("Tulpar",23,'M',54293723,"Teste Analyst",120000);

        ArrayList<Tester>testers=new ArrayList<>(Arrays.asList(tester1,tester2,tester3,tester4,tester5));

        Developer developer1=new Developer("Ismail",23,'M',42983436,"Senior Developer",169000);
        Developer developer2=new Developer("Sam",33,'M',8264539,"Full Stack Developer",149000);
        Developer developer3=new Developer("John",42,'M',53729905,"Backend Developer",150000);
        Developer developer4=new Developer("Patel",39,'M',43972384,"Frontend Developer",160000);
        Developer developer5=new Developer("Caty",41,'F',95338554,"Backend Developer",160000);

        ArrayList<Developer>developers=new ArrayList<>(Arrays.asList(developer1,developer2,developer3,developer4,developer5));
        double maxTesterSalary=Double.MIN_VALUE;
        for(Tester each:testers){
            System.out.println(each.toString());
            if(each.salary>maxTesterSalary){
                maxTesterSalary=each.salary;
            }
        }
        System.out.println("The max tester salary is "+maxTesterSalary);


        double maxDeveloperSalary=Double.MIN_VALUE;
        for(Developer each:developers){
            System.out.println(each.toString());
            if(each.salary>maxDeveloperSalary){
                maxDeveloperSalary=each.salary;
            }
        }
        System.out.println("The max developer salary is "+maxDeveloperSalary);

    }

}
