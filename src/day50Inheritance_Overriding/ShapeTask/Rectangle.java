package day50Inheritance_Overriding.ShapeTask;

public class Rectangle extends Shape{
    public double width;
    public double length;

    public Rectangle(double width, double length){
        this.length=length;
        this.width=width;
        area=calculateArea();
        perimeter=calculatePerimeter();
    }


    public double calculateArea(){
        return width*length;
    }

    public double calculatePerimeter(){
        return 2*(width+length);
    }

}
