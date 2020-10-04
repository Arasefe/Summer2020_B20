package day53_finalKeyword.warmup;
/*
Task
        1. create a class called Device
         Attributes: brand (static & do not initialize)
         Model, price, screenSize
         create a constructor that can initialize the instance

 */
public class Device {
    public static String brand;

    String model;
    double price;
    double screenSize;

    public Device(String model, double price, double screenSize){
        this.model=model;
        this.price=price;
        this.screenSize=screenSize;
    }

}
