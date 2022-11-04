package chapters.chapter09.exercises09.Exercises09_12;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return (getA() * getD()) - (getB() * getC()) != 0;
    }

    public double getX() {
        return (getE() * getD() - getB() * getF()) / (getA() * getD() - getB() * getC());


    }

    public double getY() {
        return (getA() * getF() - getE() * getC()) / (getA() * getD() - getB() * getC());

    }

    public void display() {
        if (isSolvable()) {
            System.out.println("x is -->" + getX());
            System.out.println("y is -->" + getY());
        } else {
            System.out.println("The equation has no solution");
        }
    }


}
