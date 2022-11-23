package chapters.chapter12.Listing12.Listing_12_07CircleWithEx;

public class CircleWithException {
    private double radius;

    private static int numberOfObject = 0;


    public CircleWithException() {
        this(1.0);

    }

    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObject++;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius can not be negative");
        }


    }

    public static int getNumberOfObject() {
        return numberOfObject;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }
}














