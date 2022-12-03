package chapters.chapter13.Exercises13.Exercises13_12;

public class Rectangle13_12 extends GeometricObject13_12 {

    private double width;
    private double height;

    public Rectangle13_12() {
    }

    public Rectangle13_12(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle13_12(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return "Rectangle1:" +
                "  width=" + width +
                "  height=" + height +
                "  Area of rectangle is " + getArea() +
                "  Perimeter of rectangle is " + getPerimeter();

    }
}
