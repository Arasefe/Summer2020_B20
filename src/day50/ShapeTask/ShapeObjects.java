package day50.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        Square square = new Square(2.5);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}

