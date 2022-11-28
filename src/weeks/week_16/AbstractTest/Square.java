package weeks.week_16.AbstractTest;

public class Square extends GeoObject {
    private double edge;

    public Square() {
    }

    public Square(double line) {
        this.edge = line;
    }

    public double getLine() {
        return edge;
    }

    @Override
    public double getArea() {
        return edge * edge;
    }

    @Override
    public double getPerimeter() {
        return 4 * edge;
    }

}
