package chapters.chapter09.exercises09.Exercises09_01;

public class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        this(1, 1); //default values
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void print() {
        System.out.println("the width is " + this.width);
        System.out.println("the height is " + this.height);
        System.out.println("the area is " + this.getArea());
        System.out.println("the perimeter is " + this.getPerimeter());
    }

}
