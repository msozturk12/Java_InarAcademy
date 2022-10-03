package chapters.chapter06.Listing06;

import java.util.Scanner;

public class PrintCalendar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Prompt the user to enter year
        System.out.print("Enter full year (e.g., 2022): ");
        int year = input.nextInt();
// Prompt the user to enter month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();
// Print calendar for the month of the year
        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        System.out.println(month + " " + year);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("            " + getMonthName(month) + "  " + year);
        System.out.println("-------------------------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");

    }

    public static void printMonthBody(int year, int month) {

    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }

        return monthName;
    }
/*
    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print(" ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }



    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
         // Get total number of days from 1/1/1800 to month/1/year
         int totalNumberOfDays = getTotalNumberOfDays(year, month);
        int total
    }
*/
}
