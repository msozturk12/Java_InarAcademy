package chapters.chapter13.Exercises13.Exercises13_20;

public class Complex implements Cloneable {
    private double a;
    private double b;

    public Complex() {
        this(0, 0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex(double a) {
        this(a, 0);
    }


    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex secondComplexNum) {
        double c = secondComplexNum.getRealPart();
        double d = secondComplexNum.getImaginaryPart();
        return new Complex((a + c) , (b + d));
    }

    public Complex subtract(Complex secondComplexNum) {
        double c = secondComplexNum.getRealPart();
        double d = secondComplexNum.getImaginaryPart();
        return new Complex((a - c) , (b - d));
    }

    public Complex multiply(Complex c2) {
        double c = c2.getRealPart();
        double d = c2.getImaginaryPart();
        return new Complex(((a * c) - (b * d)) , ((b * c) + (a * d)));
    }

    public Complex divide(Complex c2) {
        double c = c2.getRealPart();
        double d = c2.getImaginaryPart();
        return new Complex((((a * c) + (b * d)) / ((c * c) + (d * d))) , (((b * c) - (a * d)) / ((c * c) + (d * d))));
    }

    public double abs() {
        return Math.sqrt((a * a) + (b * b));
    }

    @Override
    public Complex clone() throws CloneNotSupportedException {
        return (Complex) super.clone();
    }

    @Override
    public String toString() {
        return b == 0 ? a + "" : "(" + a + " + " + b + "i)";
    }

}
