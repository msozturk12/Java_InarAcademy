package chapters.chapter10.Exercises10.Exercise10_26;

public class Calculator {
    public static void main(String[] operand) {
        if (operand.length != 3) {
            System.out.println("Usage:java Calculator operand1 operator operand2");
            System.exit(0);
        }


        operand[0] = operand[0].trim();
        operand[2] = operand[2].trim();
        Integer n1 = Integer.parseInt(operand[0]);
        Integer n2 = Integer.parseInt(operand[2]);
        int result = 0;

        switch (operand[1].charAt(0)) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '.':
                result = n1 * n2;
                break;
            case 'b':
                result = n1 / n2;
                break;
        }

        System.out.println(n1 + " " + operand[1] + " " + n2 + " = " + result);
    }


}
