package day56_Abstraction.animal;

public class Turtle extends Animal implements Swimmable, Playable{

    @Override
    public void eat() {
        System.out.println("Turtle is eating");
    }

    @Override
    public void drink() {
        System.out.println("Turtle is drinking");
    }

    @Override
    public void sleep() {
        System.out.println("Turtle is sleeping");
    }

    @Override
    public void play() {
        System.out.println("Turtle is playing");
    }

    @Override
    public void swim() {
        System.out.println("Turtle is swimming");
    }
}
