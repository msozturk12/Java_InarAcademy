package chapters.chapter13.Exercises13.Exercises13_14;

public class Rational13_14 extends Number implements Comparable<Rational13_14> {


    private long[] r = new long[2];

    public Rational13_14() {
        this(0, 1);
    }

    public Rational13_14(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        r[1] = Math.abs(denominator) / gcd;
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
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    public Rational13_14 add(Rational13_14 secondRational) {
        long n = r[0] * secondRational.getDenominator() + r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational13_14(n, d);
    }

    public Rational13_14 subtract(Rational13_14 secondRational) {
        long n = r[0] * secondRational.getDenominator() - r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational13_14(n, d);
    }

    public Rational13_14 multiply(Rational13_14 secondRational) {
        long n = r[0] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Rational13_14(n, d);
    }

    public Rational13_14 divide(Rational13_14 secondRational) {
        long n = r[0] * secondRational.getDenominator();
        long d = r[1] * secondRational.getNumerator();
        return new Rational13_14(n, d);
    }

    @Override
    public String toString() {
        if (r[1] == 1) {
            return r[0] + " ";
        } else {
            return r[0] + "/" + r[1];
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
        return r[0] * 1.0 / r[1];
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
