package chapters.chapter09.Listing09;

public class Circle {
    double radius = 1;//default value
    double perimeter;
    double area;

    static int numberOfObject; //

    /* this is so important***
            If you want all the instances of a class to share data, use static variables, also known as
        class variables. Static variables store values for the variables in a common memory location.
        Because of this common location, if one object changes the value of a static variable, all
        objects of the same class are affected. Java supports static methods as well as static variables.
        Static methods can be called without creating an instance of the class.
     */


    public Circle() {
        numberOfObject++;

    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfObject++;

    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void setArea(double area) {
        this.area = area;

    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    static int getNumberOfObject() {
        return numberOfObject;
    }
}
