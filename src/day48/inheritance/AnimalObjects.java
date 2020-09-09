package day48.inheritance;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog("Azamet","Medium",3,'M',"Kangal");
        System.out.println(dog1.name);
        System.out.println(dog1.size);
        System.out.println(dog1.toString());
        dog1.eat();
        dog1.sleep();
        dog1.bark();

        Cat cat=new Cat("Mavuk","small",4,'M',"Angora");
        System.out.println(cat.name);
        System.out.println(cat.size);
        System.out.println(cat.toString());
        cat.eat();
        cat.sleep();
        cat.meow();

    }
}
