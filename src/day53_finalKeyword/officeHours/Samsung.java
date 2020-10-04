package day53_finalKeyword.officeHours;

public class Samsung extends Phone {
     /*
        variables: 4
        methods: 3
     */

    public Samsung(String model, double price){
        super(model, price);
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println("Samsung "+model+" is calling: "+phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Samsung "+model+" is texting: "+phoneNumber);
    }

    static{
        brand = "Samsung";
        madeIn = "Korea";
    }


}
