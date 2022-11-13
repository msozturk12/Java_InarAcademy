package chapters.chapter06.Exercises06;

public class Exercises_06_24 {
    public static void main(String[] args) {
        /*
            (Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
            current time. Improve this example to display the current date and time. The calendar
            example in Listing 6.12, PrintCalendar.java, should give you some ideas on
            how to find the year, month, and day.

         */
        long totalMilliseconds = System.currentTimeMillis();
        String date = getStartDay(totalMilliseconds);

        System.out.println(date + "-->" +  getcurrentTime(totalMilliseconds));

    }

    public static String getcurrentTime(long totalMilliseconds) {

        long currentMilliseconds = totalMilliseconds % 1000;
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;


        return currentHours + ":" + currentMinutes + ":" + currentSeconds + currentMilliseconds + " GMT";


    }

    public static String getStartDay(long totalMilliseconds) {

        final int START_DAY_FOR_JAN_1_1800 = 3; //it is given

        long currentMilliseconds = totalMilliseconds % 1000;
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        long totalDays = totalHours / 24;

        int year = 1970;
        // Return the start day for month/1/year
        int currentDay = ( START_DAY_FOR_JAN_1_1800 + (int) totalDays+ 1) % 7; //+1 is for this day
        String dayName = getDayName(currentDay);

        while (totalDays > 365) {
            totalDays -= 365;
            year++;
            if (isLeapYear(year)) {
                totalDays -= 1;
            }
        }
        int remainingDay = (int) totalDays;
        int month = getMonth(year, remainingDay);
        String monthName = getMonthName(month);
        int dayNumber = getDayNumber(remainingDay, year, month) + 1;
        String date = dayNumber + " " + monthName + " " + year + " " + dayName;

        return date;


    }

    public static int getDayNumber(int remainingDay, int year, int month) {
        int monthCount = 1;

        while (monthCount < month) {

            remainingDay -= getNumberOfDaysInMonth(year,monthCount);

            monthCount++;
        }
        return remainingDay;

    }

    private static String getMonthName(int month) {
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

    public static int getMonth(int year, int remainingDay) {
        int month = 1;

        int days = 0;

        while (days < remainingDay) {   //remaining day ex.300

            switch (month) {
                case 1:
                    days += 31;
                    break;
                case 2:
                    days += (isLeapYear(year)) ? 29 : 28;
                    break;
                case 3:
                    days += 31;
                    break;
                case 4:
                    days += 30;
                    break;
                case 5:
                    days += 31;
                    break;
                case 6:
                    days += 30;
                    break;
                case 7:
                    days += 31;
                    break;
                case 8:
                    days += 31;
                    break;
                case 9:
                    days += 30;
                    break;
                case 10:
                    days += 31;
                    break;
                case 11:
                    days += 30;
                    break;
                case 12:
                    days += 31;
            }
            month++;
        }
        return (month - 1);
    }

    private static String getDayName(int currentDay) {

        String dayName = "";

        switch (currentDay) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thurday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;

        }
        return dayName;
    }


    public static double getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 0;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}