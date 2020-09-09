package day51_Exceptions.pets;
/*
Animal Task:
            1. create a class called Pet
                    attributes:
                    name, age, gender, breed, color
                    create a constructor that can initialize the instances
                    instance methods (with protected access modifiers):
                            eat(): by default assume all Pets eat  chocolate
                            drink(): by default assume all Pets drink milk
                            sleep(): by default assume all Pet sleep on the floor
                            toString():



 */
public class Pet {
    String name;
    int age;
    char gender;
    String breed;
    String color;

    public Pet(String name, int age, char gender, String breed, String color){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.breed=breed;
        this.color=color;
    }

    protected void eat(){
        System.out.println(name+" eat chocolate");
    }

    protected void drink(){
        System.out.println(name+ " drink milk");
    }

    protected void sleep(){
        System.out.println(name+" sleep on the floor");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
