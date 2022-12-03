package chapters.chapter13.Exercises13.Exercises13_11;

import chapters.chapter13.Exercises13.Exercises13_10.GeometricObject13_10;

public class Octagon extends GeometricObject13_11 implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon() {
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + (4 / Math.sqrt(2))) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * this.side;
    }


    @Override
    public int compareTo(Octagon o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Area of octagon: " + getArea() +
                "\nPerimeter of octagon: " + getPerimeter();


    }
}
