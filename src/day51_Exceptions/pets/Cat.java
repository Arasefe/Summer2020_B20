package day51_Exceptions.pets;
/*
 3. create a sub class of Pet called Cat and override the instance methods
 */
public class Cat extends Pet {

    public Cat(String name, int age, char gender, String breed, String color) {
        super(name, age, gender, breed, color);
    }

    @Override
    protected void eat() {
        System.out.println(name+" is eating cat food");
    }

    @Override
    protected void drink() {
        System.out.println(name+" is drinking milk");
    }

    @Override
    protected void sleep() {
        System.out.println(name+" is sleeping all day");
    }

    @Override
    public String toString() {
        return "Cat[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ']';
    }
}
