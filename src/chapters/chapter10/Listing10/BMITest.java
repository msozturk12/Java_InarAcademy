package chapters.chapter10.Listing10;

public class BMITest {
    public static void main(String[] args) {


        BMI bmi2 = new BMI("Kim yang ",18,70,145);
        bmi2.displayBmi();

        BMI bmi3 = new BMI("Susan king",70,215);
        bmi3.displayBmi();

        BMI bmi4 = new BMI("Mesut",20,70,139);//  inch and pound value
        bmi4.displayBmi();


    }
}
