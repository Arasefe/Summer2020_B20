package day52_Exceptions.warmup;
/*
 3. create subclasses of Employee called:
                        1. Tester
                        2. Developer
 */
public class Tester extends Employee {
    public Tester(String name, int age,char gender, long ID, String jobTitle, double salary){
        super(name,age,gender,ID,jobTitle,salary);
    }
}
