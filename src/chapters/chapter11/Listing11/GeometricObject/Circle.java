package chapters.chapter11.Listing11.GeometricObject;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;

    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }

    public void printCircle() {
        super.toString();
        System.out.println("The circle is created " + super.getDateCreated() +
                " and the radius is " + radius);
    }


}
