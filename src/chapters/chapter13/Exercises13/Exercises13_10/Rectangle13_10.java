package chapters.chapter13.Exercises13.Exercises13_10;

public class Rectangle13_10 extends GeometricObject13_10 implements Comparable<Rectangle13_10> {

    private double width;
    private double height;

    public Rectangle13_10() {
    }

    public Rectangle13_10(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle13_10(String color, boolean filled, double width, double height) {
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

    @Override
    public int compareTo(Rectangle13_10 o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object o) {
        return this.getArea() == ((Rectangle13_10) o).getArea();
    }
}
