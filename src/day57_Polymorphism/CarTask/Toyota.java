package day57_Polymorphism.CarTask;

public class Toyota extends Car {
    public Toyota(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public String toString() {
        return "Toyota [ "+ brand + "Model: "+ model+"Color: "+color + "Year: "+year+"Price: $"+price+"]";
    }

    @Override
    public void start() {
        System.out.println("Toyota is starting with ...");
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota is accelerating  60 miles/ph in 12 seconds...");

    }

    @Override
    public void gear() {
        System.out.println("Toyota is gearing up manually...");
    }
}
