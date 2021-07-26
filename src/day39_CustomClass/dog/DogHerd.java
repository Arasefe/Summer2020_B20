package day39_CustomClass.dog;

import day39_CustomClass.dog.Dog;

public class DogHerd {

    public static void main(String[] args) {

        Dog dog1 = new Dog();


        Dog[] dogs = { new Dog(),  new Dog(), new Dog(), new Dog(), new Dog()  };
            //               0           1          2         3            4

        dogs[0].setDogInfo("Karaoglan", "German Shepperd", "Medium",  6, "Black");
        dogs[1].setDogInfo("Roko", "German Sheper", "Medium", 3, "Brown");
        dogs[2].setDogInfo("Champ" , "Retriver", "small", 5, "Black");
        dogs[3].setDogInfo("Akbas", "Anatolian Sheppard", "Large",  2, "White");
        dogs[4].setDogInfo("Grizzly","BoxerPitt","Large",3,"Mix");
        //dogs[5].setDogInfo("Pasa", "Pitbull","large", 1, "White");

        for(int i=0; i <= dogs.length-1; i++ ){
            dogs[i].getDogInfo();
        }


        System.out.println("=====================================================");

        for(Dog eachDog : dogs ){
            eachDog.getDogInfo();
        }

        System.out.println("====================================================");
        String food = "treats";
        for( Dog eachDog  : dogs ){
            eachDog.eat(food);
        }

        System.out.println("=====================================================");
        String drink = "milk";
        for( Dog eachDog  : dogs ){
                eachDog.drink(drink);
        }

        System.out.println("====================================================");
        // play
        for( Dog eachDog  : dogs ){
            eachDog.play();
        }

        System.out.println("====================================================");
        // sleep
        for( Dog eachDog  : dogs ){
            eachDog.sleep();
        }



    }

}
