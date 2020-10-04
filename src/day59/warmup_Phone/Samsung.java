package day59.warmup_Phone;
/*
4. create a subclass of Phone called Samsung (meant to be sub class ONLY)
that can inherit from AndroidApp.
Add a constructor with three arguments of model, screenSize, price
call the super class' constructor to initialize all the fields
        Methods:
        call(long number)
        text(long number)
        equal(Device device): returns true if the given argument is Samsung and its model equal to instance variable model
        download()
        toString()
 */
final public class Samsung extends Phone implements AndroidApp {

    public Samsung(String brand, String model, double screenSize, double price) {
        super("Samsung", model, screenSize, price);
    }

    @Override
    public void call(long number) {
        System.out.println(brand+" "+model+" is calling "+number);
    }

    @Override
    public void text(long number) {
        System.out.println(brand+" "+model+" is texting "+number);
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
        return "Samsung[" +
                "brand='" + brand +
                ", model='" + model +
                ", screenSize=" + screenSize +
                ", price=" + price +
                ']';
    }

    @Override
    public void download() {
        System.out.println(brand+" "+model+" is downloading... ");
    }
}
