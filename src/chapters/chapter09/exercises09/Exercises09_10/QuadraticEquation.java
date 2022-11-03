package chapters.chapter09.exercises09.Exercises09_10;

public class QuadraticEquation {
    private double a;

    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(getB(), 2) - (4 * getA() * getC());

    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-getB() + Math.sqrt(getDiscriminant())) / (2 * getA());
        }
        return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() > 0) {
            return (-getB() - Math.sqrt(getDiscriminant())) / (2 * getA());
        }
        return 0;
    }

    public void display() {
        if (getDiscriminant() > 0) {
            System.out.println("The equation has two roots:\nRoot1 is : " + getRoot1() + "\nRoot2 is : " + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("The equation has one roots: " + getRoot1());
        } else {
            System.out.println("The equation has no root");
        }
    }


}
