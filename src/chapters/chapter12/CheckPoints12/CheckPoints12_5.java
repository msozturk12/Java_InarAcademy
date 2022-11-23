package chapters.chapter12.CheckPoints12;

public class CheckPoints12_5 {
    public static void main(String[] args) {
        try {
            int value = 30;
            if (value < 40)
                throw new Exception("value is too small");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block");
    }
}
/*
while value is 30, output is-->
            value is too small
            Continue after the catch block

while value is 50 ,output is-->
            Continue after the catch block
 */