package day56_Abstraction.animal;

public class Penguin extends Animal implements Flyable {

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void drink() {
        System.out.println("Penguin is drinking");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Penguin is flying");
    }
}
