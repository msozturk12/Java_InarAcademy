package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[][] statesAndCapitals = getStatesAndCapitals();
        int correctCount = 0;

        for (int i = 0; i < statesAndCapitals.length; i++) {
            System.out.printf("What is the capital of %s ?", statesAndCapitals[i][0]);
            String answer = input.nextLine();

            if (isEquals(answer, statesAndCapitals[i][1])) {
                System.out.println("Your answer is correct");
                correctCount++;
            } else {
                System.out.printf("The correct answer should be %s ", statesAndCapitals[i][1]);

            }
            System.out.println();
        }
        System.out.println("The correct count is " + correctCount);

    }

    public static boolean isEquals(String answer, String guess) {
        if (answer.length() != guess.length()) {
            return false;
        }
        guess = guess.toLowerCase();
        answer = answer.toLowerCase();

        for (int i = 0; i < answer.length(); i++) {

            if (answer.charAt(i) != guess.charAt(i)) {
                return false;
            }

        }
        return true;
    }

    public static String[][] getStatesAndCapitals() {
        String[][] statesAndCapital = {
                {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
                {"Colorado", "Denver"}, {"Connecticut", "Hartford"},
                {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
                {"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
                {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
                {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada	", "Carson City"}, {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
                {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"}, {"Texas", "Austin"},
                {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"},
                {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};
        return statesAndCapital;
    }

}

