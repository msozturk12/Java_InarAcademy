package chapters.chapter06.Exercises06;

public class Exercises_06_09 {
    public static void main(String[] args) {

        System.out.println("Feet        Meters      |       Meters      Feet");

        for (double feet = 1.0, meters = 20.0; feet <= 10.0 && meters <= 65.5; feet++, meters += 5.0) {
            System.out.printf("%4.1f        %5.3f       |       %4.1f       %8.3f\n", feet, footToMeter(feet), meters, meterToFoot(meters));
        }

    }

    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
}
