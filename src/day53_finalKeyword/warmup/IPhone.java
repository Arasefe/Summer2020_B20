package day53_finalKeyword.warmup;
/*
2. create a subclass of Phone called iPhone
initialize all the variables using constructor & static block
if price is higher than $1500, throw a runtime exception with a message of "Iphone' price cannot be higher than $1500"
methods: call, text, toString, faceTime
 */
public class IPhone extends Phone {

    static {
        brand = "Iphone";
        operatingSystem = "IOS";
        madeIn = "USA";
    }

    public IPhone(String model, double screenSize, double price, boolean isTouchScreen) {
        super(model, screenSize, price, isTouchScreen);
        if (price > 1500) {
            throw new RuntimeException("Iphone's price cannot be higher than $1500");
        }
    }

    public void call() {
        System.out.println(brand+" is calling...");
    }

    public void text() {
        System.out.println(brand+" is texting...");
    }

    public void faceTime() {
        System.out.println(brand+" is communicating through Facetime");
    }

    @Override
    public String toString() {
        return "Iphone[" +
                "isTouchScreen=" + isTouchScreen +
                ", model=" + model +
                ", price=" + price +
                ", screenSize=" + screenSize +"]";

    }
}