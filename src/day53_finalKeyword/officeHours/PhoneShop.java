package day53_finalKeyword.officeHours;

public class PhoneShop {
    public static void main(String[] args) {
        IPhone iphone=new IPhone("11 Pro",1000);

        iphone.call(911);
        iphone.text(123456);

        System.out.println(iphone);

        System.out.println("===========================");

    }
}
