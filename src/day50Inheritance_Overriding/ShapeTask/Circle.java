package day50Inheritance_Overriding.ShapeTask;
/*
variables: area. perimeter
methods:calculateArea(), calculatePerimeter()
 */
public class Circle extends Shape{
    public double area;
    public double perimeter;

    public double radius;
    public double diameter;
    public double PI=3.14;

    public Circle(double radius){
        this.radius=radius;
        diameter=radius*2;
        area=calculateArea();
        perimeter=calculatePerimeter();
    }

    public double calculateArea(){
        return radius*radius*PI;
    }

    public double calculatePerimeter(){
        return diameter*PI;
    }
}
