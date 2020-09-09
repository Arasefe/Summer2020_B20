package day52_Exceptions.warmup;
/*
Task01:
    1. create a class called Person
            attributes:
                name, age, gender
            add a constructor that can initialize the attributes
            generate a toString method that can print any Person object
 */
public class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String toString(){
        return "[Name: "+name+
                "\nAge "+age+
                "\nGender: "+gender+"]";
    }

}
