package day59_OOPReview.warmup_Phone;
/*
 6. create a subclass of Phone called Iphone (meant to be sub class ONLY) that can inherit from AppleApp
            Add a constructor with three arguments of model, screenSize, price
                call the super class' constructor to initialize all the fields

            Methods:
                call(long number)
                text(long number)
                faceTime(long number)
                equal(Device device): returns true if the given argument is Iphone and its model equal to instance variable model
                download()
                toString()
 */
final public class Iphone extends Phone implements AppleApp {


    public Iphone(String brand, String model, double screenSize, double price) {
        super(brand, model, screenSize, price);
    }

    @Override
    public void call(long number) {
        System.out.println("Iphone is calling "+number);
    }

    @Override
    public void text(long number) {
        System.out.println("Iphone is texting "+number);
    }


    @Override
    public void download() {

    }

    @Override
    public boolean equal(Device device) {
        if(device.brand.equals(brand)&&device.model.equals(model)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Iphone[" +
                "brand='" + brand +
                ", model='" + model +
                ", screenSize=" + screenSize +
                ", price=" + price +
                ']';
    }
}
