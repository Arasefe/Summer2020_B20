package day49.warmupmuhtar;

public class Employee extends Person{
     /*
    name, age, gender
    getSsn(), setSsn(), sleep(), setInfo(name, age, gender)
     */

    public double salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name, int age, char gender, double salary, int ID, String jobTitle){
        setInfo(name, age, gender);
        this.salary = salary;
        this.ID=ID;
        this.jobTitle=jobTitle;
    }
    // method overloading: sets name, age, gender, salary, id, jonbtitle

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Name is "+name+ ", age is "+age+", gender type: "+gender+", Salary= $"+salary+", Employee ID: "+ID
                +", Job title is: "+jobTitle;
    }

}
