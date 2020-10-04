package day57_Polymorphism.CarTask;

public abstract class Car {
    final int a=12;
    int b=4;
    String brand;
    String model;
    String color;
    int year;
    double price;
    static final int axle;

    static{
        axle=2;
    }

    public Car(String brand, String model, String color, int year, double price){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.year=year;
        this.price = price;
    }

    public String toString(){
        return "Brand: "+ brand + "Model: "+ model+"Color: "+color + "Year: "+year+"Price: $"+price;
    }


    public abstract void start();

    public abstract void accelerate();

    public abstract void gear();



}
