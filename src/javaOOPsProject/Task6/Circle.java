package javaOOPsProject.Task6;

public class Circle implements Shape {

    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * circleRadius * circleRadius;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * circleRadius;
        return perimeter;
    }

    public static void main(String[] args) {

        Circle obj = new Circle(12);
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculatePerimeter());


    }
}
