package day59.warmup_Phone;
/*
9. Create a sub class of Laptop called Dell (meant to be subclass ONLY) that inherits from WindowsApp interface
            add a constructor with three arguments of model, screenSize, price
            call the super class' constructor to initialize all the fields
            Methods:
                coding()
                download()
                equal(Device device): returns true if the given Argument is Dell and its model equal to the instance variable model
                toString()
 */
final public class Dell extends LapTop implements WindowsApp {
    public Dell(String model, double screenSize, double price) {
        super("Dell", model, screenSize, price);
    }

    public void coding() {
        System.out.println(brand + " is using in coding...");
    }

    public void download() {
        System.out.println(brand + " is downloading... ");
    }

    public  boolean equal(Device device) {
        if (device.brand.equals("Dell") && device.model.equals(model)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dell[" +
                "brand='" + brand +
                ", model='" + model +
                ", screenSize=" + screenSize +
                ", price=" + price +
                ']';
    }
}
