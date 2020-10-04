package day54_Abstraction.abstraction.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Car car1=new BMW();
        BMW car2=new BMW();
        Toyota car3=new Toyota();
        Tesla car4=new Tesla();

        car1.start();
        car2.start();
        car3.start();
        car4.start();
    }

}
