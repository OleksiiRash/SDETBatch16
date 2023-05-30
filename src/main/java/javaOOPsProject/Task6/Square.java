package javaOOPsProject.Task6;

public class Square implements Shape {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        double area = sideLength * sideLength;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 4 * sideLength;
        return perimeter;
    }

    public static void main(String[] args) {


        Square obj = new Square(9);
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculatePerimeter());


    }
}
