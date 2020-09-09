package day48.inheritance;

public class Animal {
    public String name;
    public String size;
    public int age;
    public char gender;
    public String breed;

    // setInfo is better to be declared in super class

    public void setInfo(String name,String size,int age, char gender,String breed){
         this.name=name;
         this.size=size;
         this.age=age;
         this.gender=gender;
         this.breed=breed;

    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString(){
        System.out.println("========================================");
        return "Name "+name+"\nSize "+size+"\nAge "+age+"\nGender"+gender+"\nBreed "+breed;
    }
}
