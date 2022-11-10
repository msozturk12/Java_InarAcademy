package chapters.chapter10.Exercises10.Exercise10_11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);//no-arg default
    }


    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double distanceToOrigin = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distanceToOrigin <= this.radius;
    }

    public boolean contains(Circle2D circle) { //returns true if the specified circle is inside this circle
        double distanceToCenter = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distanceToCenter <= Math.abs(this.radius - circle.radius);//from Ex.3.29


    }

    public boolean overlaps(Circle2D circle) {
        double distanceToCenter = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distanceToCenter <= this.radius + circle.radius;//from Ex.3.29

    }
}
