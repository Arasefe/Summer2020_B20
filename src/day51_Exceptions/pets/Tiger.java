package day51_Exceptions.pets;

public class Tiger extends Pet{

    public Tiger(String name, int age, char gender, String breed, String color) {
        super(name, age, gender, breed, color);
    }


    @Override
    public String toString() {
        return "Tiger[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ']';
    }
}
