package chapters.chapter13.Exercises13.Exercises13_15;

import java.math.BigInteger;

public class Rational13_15 extends Number implements Comparable<Rational13_15> {


    private BigInteger[] r = new BigInteger[2];

    public Rational13_15() {
        this(new BigInteger("0"), new BigInteger("1"));
    }

    public Rational13_15(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        r[0] = (denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : new BigInteger("-1"));
        r[1] = denominator.divide(gcd);
    }

    private static BigInteger gcd(BigInteger numerator, BigInteger denominator) {
        BigInteger n1 = numerator;
        BigInteger n2 = denominator;
        BigInteger gcd = BigInteger.ONE;

        for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)) {
            if (n1.remainder(k).compareTo(BigInteger.ZERO) == 0 &&
                    n2.remainder(k).compareTo(BigInteger.ZERO) == 0) {
                gcd = k;
            }
        }
        return gcd;

    }

    public BigInteger getNumerator() {
        return r[0];
    }

    public BigInteger getDenominator() {
        return r[1];
    }

    /*
     long n = r[0] * secondRational.getDenominator() + r[1] * secondRational.getNumerator();
            long d = r[1] * secondRational.getDenominator();
     */
    public Rational13_15 add(Rational13_15 secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator()).add(r[1].multiply(secondRational.getDenominator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational13_15(n, d);
    }

    public Rational13_15 subtract(Rational13_15 secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator()).subtract(r[1].multiply(secondRational.getDenominator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational13_15(n, d);
    }

    public Rational13_15 multiply(Rational13_15 secondRational) {
        BigInteger n = r[0].multiply(secondRational.getNumerator());
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational13_15(n, d);
    }

    public Rational13_15 divide(Rational13_15 secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator());
        BigInteger d = r[1].multiply(secondRational.getNumerator());
        return new Rational13_15(n, d);
    }

    @Override
    public String toString() {
        if (r[1].compareTo(BigInteger.ONE) == 0) {
            return r[0] + " ";
        } else {
            return r[0] + "/" + r[1];
        }

    }

    public boolean equals(Object other) {
        return (((this.subtract((Rational13_15) other)).getNumerator()).compareTo(BigInteger.ZERO) == 0);
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
        return this.getNumerator().doubleValue() / this.getDenominator().doubleValue();
    }

    @Override
    public int compareTo(Rational13_15 o) {
        if ((this.subtract(o).getNumerator()).compareTo(BigInteger.ZERO) > 0) {
            return 1;
        } else if ((this.subtract(o).getNumerator()).compareTo(BigInteger.ZERO) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
