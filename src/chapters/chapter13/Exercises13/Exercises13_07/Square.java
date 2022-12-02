package chapters.chapter13.Exercises13.Exercises13_07;

import chapters.chapter13.Exercises13.Exercises13_05.GeometricObject;

public class Square extends GeometricObject implements Colorable {
    private double edge;

    public Square() {
        this(0);
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
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


    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");

    }

    @Override
    public String toString() {
        return "Square{" +
                "\nedge=" + edge +
                "\nArea of Square -->" + getArea()+
                "\nPerimeter of Square-->" + getPerimeter();
    }
}
