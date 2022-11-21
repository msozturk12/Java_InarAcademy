package weeks.week_15.Calculator;

public class Calculator {

    public static Number sum(Number n1, Number n2) {
        return new Number(n1.getValue() + n2.getValue());

    }

    public static Number subtract(Number n1, Number n2) {
        return new Number(n1.getValue() - n2.getValue());

    }

    public static Number divide(Number n1, Number n2) {
        return new Number(n1.getValue() / n2.getValue());

    }

    public static Number multiply(Number n1, Number n2) {
        return new Number(n1.getValue() * n2.getValue());

    }

    public static Number mod(Number n1, Number n2) {
        return new Number(n1.getValue() % n2.getValue());

    }

    public static Number reset() {
        return new Number(0);

    }

    public static Number change1(Number n1) {
        return new Number(n1.getValue() * -1);

    }
    public static Number change2(Number n2) {
        return new Number(n2.getValue() * -1);

    }

}
