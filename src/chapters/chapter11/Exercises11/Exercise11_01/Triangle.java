package chapters.chapter11.Exercises11.Exercise11_01;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1, 1, 1);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;

    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    public void display() {
        System.out.printf("The area is: %.2f\nThe perimeter: %.2f\nThe color :%s\nisFilled: %b ", getArea(), getPerimeter(), getColor(), isFilled());
    }

}
