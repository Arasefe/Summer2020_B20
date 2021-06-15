package day48_Inheritance.inheritance.InterfaceInheritance;

public interface INavigatable {
    public void navigate();

    public default void turn(int degree){
        System.out.println("Turning to "+degree +" degree");
    }

}
