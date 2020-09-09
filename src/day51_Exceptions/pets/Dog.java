package day51_Exceptions.pets;
/*
2. create a sub class of Pet called Dog
                    override the instance methods:
                    eat(): dog eats Chicken
                    drink(): dog drinks water
                    sleep(): dog sleeps on the bed
 */
public class Dog extends Pet {

    double price;

    public Dog(String name, int age, char gender, String breed, String color) {
        super(name, age, gender, breed, color);
    }

}
