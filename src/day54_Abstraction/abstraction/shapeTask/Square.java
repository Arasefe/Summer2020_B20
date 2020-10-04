package day54_Abstraction.abstraction.shapeTask;

public final class Square extends Shape {
    public static String name;
    public static boolean hasVolume;
    public double volume;
    public double side;
    double area;
    double perimeter;
    static{
        name="Square";
        hasVolume=false;
    }
    public Square(double side){
        this.side=side;
        area=calculateArea();
        perimeter=calculatePerimeter();
        volume=calculateVolume();

    }

    public double calculateArea(){
        return side*side;
    }

    public double calculatePerimeter(){
        return 2*(side+side);
    }

    public double calculateVolume(){
        return 0;
    }


    @Override
    public String toString() {
        return "Square{" +
                "volume=" + volume +
                ", side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}


