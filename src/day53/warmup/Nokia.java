package day53.warmup;

/*
4. create a subclass of Phone called Nokia
initialize all the variables using constructor & static block
if price is higher that $50, throw a runtime exception with a message of "Nokia Phone' price cannot be higher than $50"
methods: call, text, toString, breakTheFloor
 */
public class Nokia extends Phone {

    static {
        brand = "Nokia";
        operatingSystem = "IOS";
        madeIn = "Finland";
    }

    public Nokia(String model, double screenSize, double price, boolean isTouchScreen) {
        super(model, screenSize, price, isTouchScreen);
        if (price < 50) {
            throw new RuntimeException("Nokia Phone's price cannot be higher than $50");
        }
    }

    public void call() {
        System.out.println(brand+ " is calling..." );
    }

    public void text() {
        System.out.println(brand+ " is texting...");
    }

    public void breakTheFloor() {
        System.out.println(brand +" is breaking the floor");
    }

    @Override
    public String toString() {
        return "Nokia[" +
                "isTouchScreen=" + isTouchScreen +
                ", model=" + model +
                ", price=" + price +
                ", screenSize=" + screenSize +"]";

    }
}