package weeks.week_08;

import java.util.Scanner;

public class rotationWords {

    public static void main(String[] args) {
        /*

        InarAcademy-->demyInarAca(true)
                    -->myInarAcad (false)

        Canada  --> daCana (true)
                    adaCna (false)

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = input.nextLine();
        System.out.println("Enter the other string");
        String str2 = input.nextLine();

        boolean result1 = isRotationToAnother(str1, str2, false);
        boolean result2 = isRotationToAnother(str1, str2);

        if (isRotationToAnother(str1, str2)) {
            System.out.println("Your word is " + str1 + " and reversed form is " + str2 + "--> " + result1 + " " + result2);
        } else {
            System.out.println("Your word is " + str1 + " and reversed form is " + str2 + "--> " + result1 + " " + result2);
        }


    }

    public static boolean isRotationToAnother(String str1, String str2, boolean isRotation) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str2.equals(rotation(str1, i))) {
                return true;
            }
        }
        return false;
    }

    public static String rotation(String str1, int i) {
        String str3 = ""; //Canada 4
        for (int j = i; j < str1.length(); j++) {
            str3 += str1.charAt(j); //Cana
        }
        for (int j = 0; j < i; j++) {
            str3 += str1.charAt(j); //daCana

        }
        return str3;
    }

    public static boolean isRotationToAnother(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String str3 = str1 + str1; //CanadaCanada

        return str3.contains(str2); //Canada --> daCana
    }
}


