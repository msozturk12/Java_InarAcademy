package chapters.chapter13.Exercises13.Exercises13_09;

public class Circle13_09 extends GeometricObject13_09 implements Comparable<Circle13_09> {
    private double radius;

    protected Circle13_09() {
    }

    protected Circle13_09(double radius) {
        this.radius = radius;
    }

    protected Circle13_09(String color, boolean filled, double radius) {
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
    public int compareTo(Circle13_09 o) {
        if (this.getRadius() > o.getRadius()) {
            return 1;
        } else if (this.getRadius() < o.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        return this.getRadius() == ((Circle13_09) o).getRadius();
    }

    @Override
    public String toString() {
        return "Circle1 :" +
                "radius=" + radius +
                "\nArea of circle :" + getArea() +
                "\nPerimeter of circle :" + getPerimeter();

    }

}
