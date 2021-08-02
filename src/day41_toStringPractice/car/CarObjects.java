package day41_toStringPractice.car;

import day41_toStringPractice.car.Car;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarInfo("BMW", "X5", 2019, 50000, "Red");
        System.out.println(car1);

        Car car2= new Car();
        car2.setCarInfo("Audi","S5",2021,55000,"White");
        System.out.println(car2);



    }

}
