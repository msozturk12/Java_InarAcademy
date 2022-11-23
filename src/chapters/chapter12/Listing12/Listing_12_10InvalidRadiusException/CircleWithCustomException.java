package chapters.chapter12.Listing12.Listing_12_10InvalidRadiusException;

public class CircleWithCustomException {
    private double radius;

    private static int numberOfObject = 0;


    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);

    }

    public CircleWithCustomException(double radius) throws InvalidRadiusException {
        setRadius(radius);
        numberOfObject++;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new InvalidRadiusException(radius);
        }


    }

    public static int getNumberOfObject() {
        return numberOfObject;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }
}
