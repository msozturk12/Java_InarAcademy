package chapters.chapter13.Exercises13.Exercises13_05;



public class Rectangle1 extends GeometricObject {

    private double width;
    private double height;

    public Rectangle1() {
    }

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle1(String color, boolean filled, double width, double height) {
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
        return "\nRectangle:" +
                "\nwidth=" + width +
                "\nheight=" + height +
                "\nArea of rectangle is " + getArea() +
                "\nPerimeter of rectangle is " + getPerimeter();

    }
}
