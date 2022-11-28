package weeks.week_16.InterfaceTest;

import weeks.week_16.AbstractTest.GeoObject;

public class Lion extends GeoObject implements Runnable,Flyable {
    //A class can ımplement interfaces but only extend onr class
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void acceleration() {

    }
}
