package day59.warmup_Phone;
/*
Task: Device
    1. create an abstract class called Device
       variables: brand, model, screenSize, price
       all variables are protected and final (DO Not initialize them yet)
       abstract method: equal(Device device)

 */
public abstract class Device {
    protected  String brand;
    protected  String model;
    protected  double screenSize;
    protected  double price;


    public abstract boolean equal(Device device);
}
