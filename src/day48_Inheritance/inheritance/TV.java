package day48_Inheritance.inheritance;

/*
crate a sub class called TV
attributes brand, model, price, madeIn, hasBattery, hasMemory,screenSize, remoteControl
methods watch, setInfo, toString
add a constructor that can set the fields
 */
public class TV extends Device{

   /*
    Inherited:
        variables: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize
        methods: setInfo, toString
        we do not have yet:
        variables: remoteControl
        methods: watch
     */

    public boolean hasRemoteControl;

    public TV(String brand, String model, double price, String screenSize, boolean hasBattery, boolean hasMemory, boolean hasRemoteControl){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.hasRemoteControl = hasRemoteControl;
    }

    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }


}
