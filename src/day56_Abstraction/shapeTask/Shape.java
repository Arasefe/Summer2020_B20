package day56_Abstraction.shapeTask;
/*
task01:
 1. create an abstract class called Shape
     attributes:
     name(static), area, perimeter, hasVolume(static), volume
     abstract methods: calculateArea(), calculatePerimeter
     return-types: double

*/
public abstract class Shape {

        public static String name;
        public double area;
        public double perimeter;



        public abstract double calculateArea();

        public abstract double calculatePerimeter();





}
