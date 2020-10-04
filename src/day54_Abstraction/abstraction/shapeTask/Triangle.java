package day54_Abstraction.abstraction.shapeTask;
/*
 5. create the following sub classes of shapes:
                Square
                Triangle
                Cube
                ...
                and repeat the same steps
 */
public final class Triangle extends Shape{
    public static String name;
    public static boolean hasVolume;
    double base;
    double height;
    double side1;
    double side2;
    public double volume;


    static{
        name="Triangle";
        hasVolume=false;
    }


    public Triangle(double base, double side1, double side2){
        this.base=base;
        this.side1=side1;
        this.side2=side2;
        volume=calculateVolume();
    }
    public  double calculateArea(){
        return height*base/2;
    }

    public  double calculatePerimeter(){
        return base+side1+side2;
    }

    public double calculateVolume(){
        return 0;
    }
}
