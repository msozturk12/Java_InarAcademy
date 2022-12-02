package chapters.chapter13.Exercises13.Exercises13_01;

import chapters.chapter13.Listing13.L13_01GeoObject.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this("black", true, 3, 3, 3);
    }

    public Triangle(String color, boolean filled) {
        super(color, filled);
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "The area of Triangle-->" + getArea() +
                "\nThe perimeter of Triangle-->" + getPerimeter() +
                "\nColor of the Triangle is-->" + getColor() +
                "\nIs the triangle filled?--> " + isFilled();
    }
}
