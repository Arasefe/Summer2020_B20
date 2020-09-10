package day53.warmup;

/*
 2. create a sub class of Device called Phone
 static variables   : brand , OperatingSystem, made in (do not initialize them)
 instance variables : Model, price, screenSize, touchScreen(boolean)
 add a constructor that can initialize all instances (this is the only constructor)
 if price is lower than $0 throw a runtime exception with a message of "Invalid Price"
 methods: call, text, toString
 */
public class Phone extends Device {

    public static String operatingSystem;
    public static String madeIn;

    boolean isTouchScreen;

    public Phone(String model, double price, double screenSize, boolean isTouchScreen) {
        super(model, price, screenSize);
        this.isTouchScreen = isTouchScreen;
        if (price < 0) {
            throw new RuntimeException("Invalid Price");
        }
    }

    public void call() {
        System.out.println(brand +"is calling...");
    }

    public void text() {
        System.out.println(brand+ "is texting...");
    }

    @Override
    public String toString() {
        return "Phone[" +
                "touchScreen=" + isTouchScreen +
                ", model=" + model  +
                ", price=" + price +
                ", screenSize=" + screenSize +"]";


    }
}
