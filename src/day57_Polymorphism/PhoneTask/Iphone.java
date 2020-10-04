package day57_Polymorphism.PhoneTask;
/*
  4. create a class named iPhone that can inherit from AppleApps and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphone is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500
 */
public class Iphone extends Phone implements AppleApp {

    public Iphone( String model, String size, double price) {
        super("Iphone", model, size, price);
        if(price > 1500){
            throw new RuntimeException("Iphone price cannot be greater than 1500");
        }
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }

    @Override
    public void download() {
        System.out.println("Iphone is downloading app from "+AppStoreName);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is facetiming "+phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $ " + price +
                '}';
    }
}
