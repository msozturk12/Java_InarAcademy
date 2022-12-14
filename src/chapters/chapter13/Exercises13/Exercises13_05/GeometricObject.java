package chapters.chapter13.Exercises13.Exercises13_05;

import chapters.chapter09.Listing09.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    protected GeometricObject() {
        dateCreated = new Date();

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) > 0 ? o1 : o2;
    }

    @Override
    public String toString() {
        return "GeometricObject: " +
                "\nArea=" + getArea() +
                "\ncolor='" + color +
                "\nfilled=" + filled +
                "\ndateCreated=" + dateCreated;
    }
}
