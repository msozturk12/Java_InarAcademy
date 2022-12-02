package chapters.chapter13.Exercises13.Exercises13_06;

import chapters.chapter13.Listing13.L13_01GeoObject.GeometricObject;

public class Circle extends GeometricObject {
    private double radius;

    protected Circle() {
    }

    protected Circle(double radius) {
        this.radius = radius;
    }

    protected Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle1 :" +
                "radius=" + radius +
                "\nArea of circle :" + getArea()+
                "\nPerimeter of circle :" + getPerimeter();

    }
}
