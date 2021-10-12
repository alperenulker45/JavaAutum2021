package sef.module6.activity;

public class AbstractionActivity {
    public static void main(String[] args) {

        Shape square = new Square(5);
        square.setColor("red");

        System.out.println("-----Information About Square------");
        System.out.println("Area of the square= " + square.calculateArea());
        System.out.println("Perimeter of the square= " + square.calculatePerimeter());
        System.out.println("Color of the square = " + square.getColor());

        Shape rectangle = new Rectangle(5,6);
        rectangle.setColor("green");
        System.out.println("-----Information About Rectangle------");
        System.out.println("Area of the rectangle= " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle= " + rectangle.calculatePerimeter());
        System.out.println("Color of the rectangle = " + rectangle.getColor());


    }
}
