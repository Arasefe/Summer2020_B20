package day54_Abstraction.ex;

import java.time.LocalDate;

public class Developer extends Employee {
    public Developer(String name, char gender, LocalDate dOfb,String jobTitle,double salary){
        super(name,gender,dOfb,jobTitle,salary);
    }
}
