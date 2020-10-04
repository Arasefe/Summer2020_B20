package day59.warmup_Phone;
/*
8. create a sub class of Laptop called MacBook (meant to be subclass ONLY) that can inherit from AppleApp
            Add a constructor with three arguments of model, screenSize, price
                call the super class' constructor to initialize all the fields
            Methods:
                faceTiming(String email)
                Coding()
                download()
                equal(Device device): returns true if the given Argument is Macbook and its model equal to the instance variable model
                toString()
 */
final public class MacBook extends LapTop implements AppleApp{
    public MacBook(String brand, String model, double screenSize, double price) {
        super("MacBook", model, screenSize, price);
    }

    public void faceTiming(long number){
        System.out.println("MacBook is facetiming "+number);
    }


    @Override
    public void download() {

    }

    @Override
    public boolean equal(Device device) {
        return true;
    }
    public String toString(){
        return "Dell[" +
                "brand='" + brand +
                ", model='" + model +
                ", screenSize=" + screenSize +
                ", price=" + price +
                ']';
    }

}
