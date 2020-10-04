package day57_Polymorphism.CarTask;

public class BMW extends Car {


    public BMW(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);

    }


    @Override
    public String toString() {
        return "BMW [ "+ brand + "Model: "+ model+"Color: "+color + "Year: "+year+"Price: $"+price+"]";

    }

    @Override
    public void start() {
        System.out.println("BMW is starting with voice control...");

    }

    @Override
    public void accelerate() {
        System.out.println("Tesla is accelerating  60 miles/ph in 6 seconds...");

    }

    @Override
    public void gear() {
        System.out.println("Tesla is gearing up automatically...");

    }


}
