package day54_Abstraction.abstraction.shapeTask;
/*
 5. create the following sub classes of shapes:
                Square
                Triangle
                Cube

                and repeat the same steps
 */
public final class Cube extends Shape{

    public double edge;


    static{
        name="Cube";
    }



    public Cube(double edge){
        this.edge=edge;
        perimeter=calculatePerimeter();
    }

    public double calculateArea(){
        return 6*edge*edge;
    }

    public double calculatePerimeter(){
        return 6*edge*edge;
    }

    public double calculateVolume(){
        return edge*edge*edge;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "edge=" + edge +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
