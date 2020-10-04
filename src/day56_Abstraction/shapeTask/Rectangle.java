package day56_Abstraction.shapeTask;

public class Rectangle extends Shape {

    public double width;
    public double length;

    public Rectangle(double width, double length) {

        if(width<=0 || length<=0){
            throw new RuntimeException("width and length of rectangle cannot be negative or 0");
        }
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
        name = "Rectangle";
    }

    @Override
    public double calculateArea() {
        return width*length;
    }

    @Override
    public double calculatePerimeter() {
        return (width+length)*2;
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
