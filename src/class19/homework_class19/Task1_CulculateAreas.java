package class19.homework_class19;

public class Task1_CulculateAreas {

/*
Task 1:
Create 1 class in which create a methods that will calculate
the area of Method name must be called calculateArea
Rectangle
Square
*/

    public static void calculateArea(int rectangleSideLength) {
        System.out.println("Rectangle Area is " + (rectangleSideLength * rectangleSideLength));
    }

    public static void calculateArea(double rectangleSideLength) {
        System.out.println("Rectangle Area is " + (rectangleSideLength * rectangleSideLength));
    }

    public static void calculateArea(int squareLength, int squareWidth) {
        System.out.println("Square Area is " + (squareLength * squareWidth));
    }

    public static void calculateArea(int squareLength, double squareWidth) {
        System.out.println("Square Area is " + (squareLength * squareWidth));
    }

    public static void calculateArea(double squareLength, int squareWidth) {
        System.out.println("Square Area is " + (squareLength * squareWidth));
    }

    public static void calculateArea(double squareLength, double squareWidth) {
        System.out.println("Square Area is " + (squareLength * squareWidth));
    }


}
