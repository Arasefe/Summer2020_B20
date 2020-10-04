package day48_Inheritance.inheritance;

public class Dog extends Animal {


    public Dog(String name, String size,int age, char gender,String breed){
//        this.name=name;
//        this.size=size;
//        this.age=age;
//        this.gender=gender;
        setInfo(name,size,age,gender, breed);
    }


    public void bark(){
        System.out.println(name+" is barking");
    }


}
