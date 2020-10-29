package day59_OOPReview.warmup_Phone;
/*
6. create an abstract class called Laptop that can Inherit from Device
     Variables: screenSize
     Add a constructor that can initialize all the fields
     if the price is set to negative or zero, throw an exception with a message of:
     Price of the laptop cannot be negative or zero
 */
public abstract class LapTop extends Device {
    /*
    protected  String brand;
    protected  String model;
    protected  double screenSize;
    protected  double price;
     */
    public LapTop(String brand, String model, double screenSize, double price) {
        this.brand=brand;
        this.model=model;
        this.screenSize=screenSize;
        this.price=price;
        if(price<=0){
            throw new RuntimeException("Price of the laptop cannot be negative or zero");
        }
    }

    @Override
    public boolean equal(Device device) {
        return true;
    }
}
