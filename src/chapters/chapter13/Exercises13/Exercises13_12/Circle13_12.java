package chapters.chapter13.Exercises13.Exercises13_12;

public class Circle13_12 extends GeometricObject13_12 {
    private double radius;

    protected Circle13_12() {
    }

    protected Circle13_12(double radius) {
        this.radius = radius;
    }

    protected Circle13_12(String color, boolean filled, double radius) {
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
