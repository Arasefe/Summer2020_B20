package day56_Abstraction.animal;

public class Falcon extends Animal implements Flyable{
    @Override
    public void eat() {
        System.out.println("Falcon is eating");
    }

    @Override
    public void drink() {
        System.out.println("Falcon is drinking");
    }

    @Override
    public void sleep() {
        System.out.println("Falcon is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Falcon is flying");
    }
}
