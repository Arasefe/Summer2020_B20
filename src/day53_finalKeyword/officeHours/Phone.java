package day53_finalKeyword.officeHours;

public class Phone {
    public static String brand;
    public static String madeIn;

    public String model;
    public double price;

    public Phone(String model, double price){
        this.model  = model;
        this.price = price;
    }


    public void call(long phoneNumber){
        System.out.println("Phone is calling: "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Phone is texting to: "+phoneNumber);
    }

    public String toString(){
        return "Brand: "+brand+" Model: "+model+" Price: "+price+" Made in: "+madeIn;
    }
}
