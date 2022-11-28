package weeks.week_16.AbstractTest;

public abstract class GeoObject {

    protected boolean isFilled;

    //to maintain inheritance chain abstract classes can have constructors
    public GeoObject() {
    }


    public boolean isFilled() {
        return this.isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
