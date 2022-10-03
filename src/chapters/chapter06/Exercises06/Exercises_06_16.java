package chapters.chapter06.Exercises06;

public class Exercises_06_16 {
    public static void main(String[] args) {
        //number of days in a year
        /*
        365 gün
        leap year oldugunda 1 gün fazla oluyor

         */
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "-->" + numberOfDaysInAYear(year)+ "days" );
            System.out.println();

        }

    }

    public static  int numberOfDaysInAYear(int year){
        return isLeapyear(year)?366:365;

    }
    public static boolean isLeapyear(int year) {

        return ((year % 4 == 0 && year % 100 !=0) || year % 400 ==0);
    }


}
