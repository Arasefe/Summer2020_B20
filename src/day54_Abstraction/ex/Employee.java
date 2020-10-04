package day54_Abstraction.ex;

import java.time.LocalDate;

 public class Employee {
    public String name;
    final public char gender;
    final public LocalDate dOfb;
    public String jobTitle;
    public double salary;

    public Employee(String name, char gender, LocalDate dOfb,String jobTitle, double salary){
        this.name=name;
        this.gender=gender;
        this.dOfb=dOfb;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }


     @Override
     public String toString() {
         return "Employee [" +
                 "name=" + name +
                 ", gender=" + gender +
                 ", dOfb=" + dOfb +
                 ", jobTitle=" + jobTitle +
                 ", salary=" + salary +"]";
     }
 }
