package chapters.chapter10.Exercises10.Exercise10_02;

import chapters.chapter10.Exercises10.Exercise10_02.BMI;

public class BMITest {

    public static void main(String[] args) {
        BMI bmi1 = new BMI("Enes",26,141,5,10.078);
        bmi1.displayBmi();

        BMI bmi2=new BMI("Ertuğrul",27,194,5,10.078);
        bmi2.displayBmi();
    }
}
