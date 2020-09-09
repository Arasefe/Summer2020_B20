package day50.ShapeTask;

public class Square {
    public double side;
    double area;
    double perimeter;

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
