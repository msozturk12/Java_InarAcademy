package chapters.chapter13.Exercises13.Exercises13_12;

import chapters.chapter09.Listing09.Date;

public abstract class GeometricObject13_12 implements Cloneable{
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject13_12(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    protected GeometricObject13_12() {
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
}
