package chapters.chapter09.Listing09;

public class CircleWithPrivateDataField {
    private double radius = 1;
    private static int numberOfObject = 0;

    public CircleWithPrivateDataField() {
        numberOfObject++;
    }

    public CircleWithPrivateDataField(double radius) {
        this.radius = radius;
        numberOfObject++;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius >= 0) ? radius : 0;
    }

    public static int getNumberOfObject() {
        return numberOfObject;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
