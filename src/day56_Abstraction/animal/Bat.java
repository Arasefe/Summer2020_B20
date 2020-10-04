package day56_Abstraction.animal;

public class Bat extends Animal implements Flyable{
    @Override
    public void eat() {
        System.out.println("Bat is eating");
    }

    @Override
    public void drink() {
        System.out.println("Bat is drinking");
    }

    @Override
    public void sleep() {
        System.out.println("Bat is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying");
    }
}
