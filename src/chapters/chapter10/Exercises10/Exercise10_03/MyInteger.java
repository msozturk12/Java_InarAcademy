package chapters.chapter10.Exercises10.Exercise10_03;

import java.util.Arrays;

public class MyInteger {

    private int values;

    public MyInteger() {
        this(0);
    }

    public MyInteger(int values) {
        this.values = values;

    }

    public int getValues() {
        return this.values;
    }

    public boolean isEven() {
        return this.values % 2 == 0;
    }

    public boolean isOdd() {
        return this.values % 2 != 0;
    }

    public boolean isPrime() {

        for (int divisor = 2; divisor <= this.values / 2; divisor++) {
            if (this.values % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int values) {
        return values % 2 == 0;
    }

    public static boolean isOdd(int values) {
        return values % 2 != 0;
    }

    public static boolean isPrime(int values) {

        for (int divisor = 2; divisor <= values / 2; divisor++) {
            if (values % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt) {

        return myInt.isPrime();
    }


    public boolean equals(int values) {
        return this.values == values;
    }

    public boolean equals(MyInteger myInt) {
        return this.values == myInt.values;
    }

    public static int parseInt(char[] chArr) {
        String str = "";
        for (int i = 0; i < chArr.length; i++) {
            str += chArr[i];

        }
        return parseInt(str);
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}

