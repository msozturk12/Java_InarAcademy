package chapters.chapter13.Exercises13.Exercises13_04;

public class Calendar {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage :java Exercises13_04 month year");
            System.exit(0);
        }
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        displayCalendar(month, year);
    }

    private static void displayCalendar(int month, int year) {
        System.out.print("       ");
        getMonthName(month);
        System.out.print(" ," + year + "       ");
        System.out.println("\n-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        calendarBody(month, year);
    }




    public static void calendarBody(int month, int year) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(month, year);
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }

        }
        System.out.println();
    }
    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        totalNumberOfDays = (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
        return totalNumberOfDays;
    }
    private static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                total += 366;
            } else {
                total += 365;
            }
        }
        for (int i = 1; i < month; i++) {
            total += getNumberOfDaysInMonth(i, year);

        }
        return total;
    }
    private static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 32;
    }
    private static void getMonthName(int month) {
        switch (month) {
            case 1:
                System.out.print("Jan");
                break;
            case 2:
                System.out.print("Feb");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("Sep");
                break;
            case 10:
                System.out.print("Oct");
                break;
            case 11:
                System.out.print("Nov");
                break;
            case 12:
                System.out.print("Dec");
                break;

        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }






}
