package day54_Abstraction.ex;

import java.time.LocalDate;

final public class Tester extends Employee {        // can not be super classs
    public Tester(String name, char gender, LocalDate dOfb,String jobTitle, double salary){
        super(name,gender,dOfb,jobTitle,salary);
    }


    public void findBug(){
        System.out.println(name+" found a bug");
    }
}
