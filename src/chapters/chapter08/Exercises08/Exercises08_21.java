package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_21 {
    public static void main(String[] args) {

        double[][] coordinates = getCoordinatesFromUser();
        double[] totalDistance = getTotalDistances(coordinates);
        int centralCity = getCentralCity(totalDistance);

        System.out.printf("The central city is at (%.1f, %.1f)", coordinates[centralCity][0], coordinates[centralCity][1]);
        System.out.printf("\nThe total distance to all other cities is %.2f", totalDistance[centralCity]);
        //2,5 5 5,1 3 1 9 5,4 54 5,5 2,1
    }

    public static double[][] getCoordinatesFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cities:");
        int numberOfCities = input.nextInt();
        double[][] coordinates = new double[numberOfCities][2];
        System.out.println("Enter the coordinates of the cities:");
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i][0] = input.nextDouble();
            coordinates[i][1] = input.nextDouble();
        }
        return coordinates;
    }

    public static double[] getTotalDistances(double[][] coordinates) {
        double[] totalDistance = new double[coordinates.length];

        for (int i = 0; i < coordinates.length; i++) {
            double distance = 0;
            for (int j = 0; j < coordinates.length; j++) {
                distance += getDistance(coordinates[i], coordinates[j]);//distances between 2 points

            }
            totalDistance[i] = distance;
        }

        return totalDistance;
    }

    public static int getCentralCity(double[] totalDistance) {
        double shortest = Double.MAX_VALUE;
        int centralCity = 0;

        for (int i = 0; i < totalDistance.length; i++) {
            if (shortest > totalDistance[i]) {
                shortest = totalDistance[i];
                centralCity = i;

            }

        }
        return centralCity;
    }


    public static double getDistance(double[] city1, double[] city2) {
        return Math.sqrt(Math.pow(city2[0] - city1[0], 2) + Math.pow(city2[1] - city1[1], 2));
    }


}
