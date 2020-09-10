package day53.officeHours;

public class IPhone extends Phone {
     /*
    variables: 4
    methods: 3
     */

    public IPhone(String model, double price){
        super(model, price); // set the model, price
    }

    static{
        brand = "iPhone";
        madeIn = "USA";
    }

    @Override
    public void  call(long phoneNumber){
        System.out.println("iPhone "+model+" is calling: "+phoneNumber);
    }

    @Override
    public void text(long phoneNumber){
        System.out.println("iPhone "+model+" is texting: "+phoneNumber);
    }

}
