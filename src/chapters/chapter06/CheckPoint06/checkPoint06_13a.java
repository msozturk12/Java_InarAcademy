package chapters.chapter06.CheckPoint06;

public class checkPoint06_13a {

    /*
    When you invoke a method with an argument, the value of the argument is passed to the
    parameter. This is referred to as pass-by-value. If the argument is a variable rather than a
    literal value, the value of the variable is passed to the parameter. The variable is not affected,
    regardless of the changes made to the parameter inside the method.

 */
    public static void main(String[] args) {             //(a) The output of the program is 0
        int max = 0;
        max(1, 2, max);
        System.out.println(max);
    }

    public static void max(int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;
    }




}
