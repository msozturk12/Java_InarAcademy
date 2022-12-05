package chapters.chapter13.Listing13;

public class Rational13_14 extends Number implements Comparable<Rational13_14> {

    private long numerator = 0;
    private long denominator = 1;

    public Rational13_14() {
        this(0, 1);
    }

    public Rational13_14(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    private static long gcd(long numerator, long denominator) {
        long n1 = Math.abs(numerator);
        long n2 = Math.abs(denominator);
        int gcd = 1;
        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;

            }

        }
        return gcd;

    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational13_14 add(Rational13_14 secondRational) {
        long n = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational13_14(n, d);
    }

    public Rational13_14 subtract(Rational13_14 secondRational) {
        long n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational13_14(n, d);
    }

    public Rational13_14 multiply(Rational13_14 secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational13_14(n, d);
    }

    public Rational13_14 divide(Rational13_14 secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.getNumerator();
        return new Rational13_14(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return numerator + " ";
        } else {
            return numerator + "/" + denominator;
        }

    }

    public boolean equals(Object other) {
        return (this.subtract((Rational13_14) other)).getNumerator() == 0;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public int compareTo(Rational13_14 o) {
        if (this.subtract(o).getNumerator() > 0) {
            return 1;
        } else if (this.subtract(o).getNumerator() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
