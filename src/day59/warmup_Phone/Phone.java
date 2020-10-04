package day59.warmup_Phone;
/*
2. create an abstract class called Phone that can inherit from Device variables: screenSize
            Add a constructor that can initialize all the fields
            if the price is set to negative or zero, throw an exception with a message of: Price of the Phone cannot be negative or zero
            Abstract methods:
            call(long number), text(long number), equal(Device device)
 */
public abstract class Phone extends Device {
    /*
    protected final String brand;
    protected final String model;
    protected final double screenSize;
    protected final double price;
     */
    public Phone(String brand, String model, double screenSize, double price) {
        this.brand=brand;
        this.model=model;
        this.screenSize=screenSize;
        this.price=price;
        if(price<=0){
            throw new RuntimeException("Price of the Phone cannot be negative or zero");
        }
    }

    public abstract void call(long number);

    public abstract void text(long number);

    public abstract boolean  equal(Device device);


}
