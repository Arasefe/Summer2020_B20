package day56_Abstraction.animal;

public class Cat extends Animal implements Playable{
    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void drink() {
        System.out.println("Parrot is drinking");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping");
    }

    @Override
    public void play() {
        System.out.println("Parrot is playing");
    }
}
