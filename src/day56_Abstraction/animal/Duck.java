package day56_Abstraction.animal;

public class Duck extends Animal implements Swimmable, Flyable{
    @Override
    public void eat() {
        System.out.println("Duck is eating...");
    }

    @Override
    public void drink() {
        System.out.println("Duck is drinking...");
    }

    public void sleep(){
        System.out.println("Duck is sleeping...");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming...");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying...");
    }
}
