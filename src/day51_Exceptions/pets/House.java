package day51_Exceptions.pets;

public class House {
    public static void main(String[] args) {
        Dog dog1=new Dog("Puppy",3,'F',"Dogo","Black");
        System.out.println(dog1.toString());

        Cat cat1=new Cat("Mavuk",4,'M',"Van Kedisi","Grey");
        System.out.println(cat1.toString());

        Tiger tiger1=new Tiger("Striker",4,'M',"African Tiger","Brown");
        System.out.println(tiger1.toString());
    }
}
