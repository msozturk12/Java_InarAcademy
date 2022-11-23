package chapters.chapter12.CheckPoints12;

public class Checkpoints12_22 {
    public static void main(String[] args) {
        System.out.println(isNumeric2("4214qwe"));

    }

    public static boolean isNumeric2(String token) {
        for (int i = 0; i < token.length(); i++) {
            if (!('0' <= token.charAt(i) && token.charAt(i) <= '9')) {
                return false;
            }

        }
        return true;
    }


/*
 public static boolean isNumeric(String token) {
            try {
                Double.parseDouble(token);
                return true;
            }
            catch (java.lang.NumberFormatException ex) {
                return false;
            }
        }

write it without using Exception-->

    public static boolean isNumeric2(String token) {
        for(int i = 0; i < token.length(); i++){
            if('0' <= token.charAt(i) && token.charAt(i) <= '9'){
                return true;
            }
          return false;
        }
    }

    public static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;

        } catch (NumberFormatException ex) {
            return false;

        }
    } it's correct
}
*/
}