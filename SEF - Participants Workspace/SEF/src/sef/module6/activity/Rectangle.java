package sef.module6.activity;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length=length;
        this.breadth=breadth;
    }


    @Override
    public double calculateArea() {
        double area = length * breadth;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2*(length+breadth);
        return perimeter;
    }
}
