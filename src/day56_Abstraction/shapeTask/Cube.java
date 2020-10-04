package day56_Abstraction.shapeTask;
/*
 5. create the following sub classes of shapes:
                Square
                Triangle
                Cube

                and repeat the same steps
 */
public class Cube extends Shape implements Volume{
    public double edge;


    static{
        name="Cube";
    }



    public Cube(double edge){
        this.edge=edge;
        perimeter=calculatePerimeter();
    }



    @Override
    public double calculateArea() {
        return 6*edge*edge;
    }

    @Override
    public double calculatePerimeter() {
        return 6*edge*edge;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
