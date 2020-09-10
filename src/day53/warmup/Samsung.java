package day53.warmup;
/*
3. create a subclass of Phone called Samsung
initialize all the variables using constructor & static block
if price is higher than $1000, throw a runtime exception with a message of "Samsung phone' price cannot be higher than $1000"
 methods: call, text, toString, freeze
 */
public class Samsung extends Phone {

    static {
        brand = "Samsung";
        operatingSystem = "Android";
        madeIn = "South Korea";
    }

    public Samsung(String model, double screenSize, double price, boolean isTouchScreen) {
        super(model, screenSize, price, isTouchScreen);

        if(price>1000){
            throw new RuntimeException("Samsung phone's price cannot be higher than $1000");
        }

    }




    public void call(long phoneNumber) {
        System.out.println(brand+"Calling: " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(brand+"Texting to: " + phoneNumber);
    }

    @Override
    public String toString() {
        return "Samsung[" +
                "isTouchScreen=" + isTouchScreen +
                ", model=" + model +
                ", price=" + price +
                ", screenSize=" + screenSize +"]";

    }

    public void freeze(){
        System.out.println(brand+" is freezing");
    }

}
