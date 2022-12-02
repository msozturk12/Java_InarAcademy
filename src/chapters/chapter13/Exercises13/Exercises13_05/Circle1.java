package chapters.chapter13.Exercises13.Exercises13_05;

public class Circle1 extends GeometricObject {
    private double radius;

    protected Circle1() {
    }

    protected Circle1(double radius) {
        this.radius = radius;
    }

    protected Circle1(String color, boolean filled, double radius) {
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
        return "\nCircle:" +
                "\nradius=" + radius +
                "\nArea of circle :" + getArea()+
                "\nPerimeter of circle :" + getPerimeter()+
                "\nColor of circle: " + getColor()+
                "\nIs the circle filled:" + isFilled();


    }
}
