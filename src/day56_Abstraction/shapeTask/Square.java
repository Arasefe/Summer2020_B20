package day56_Abstraction.shapeTask;

public class Square extends Shape{
    public static String name;
    public double volume;
    public double side;
    double area;
    double perimeter;

    static{
        name="Square";

    }
    public Square(double side){
        this.side=side;
        area=calculateArea();
        perimeter=calculatePerimeter();


    }

    public double calculateArea(){
        return side*side;
    }

    public double calculatePerimeter(){
        return 2*(side+side);
    }

}
