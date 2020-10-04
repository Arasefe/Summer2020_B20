package day56_Abstraction.shapeTask;

public class Triangle  extends Shape{
    public static String name;

    double base;
    double height;
    double side1;
    double side2;
    public double volume;


    static{
        name="Triangle";
    }


    public Triangle(double base, double side1, double side2){
        this.base=base;
        this.side1=side1;
        this.side2=side2;

    }
    public  double calculateArea(){
        return height*base/2;
    }

    public  double calculatePerimeter(){
        return base+side1+side2;
    }

}
