package chapters.chapter06.Exercises06;


public class Exercises_06_08 {
    public static void main(String[] args) {

        System.out.println("Celsius      Fahrenheit      |       Fahrenheit      Celsius");

        for (double cel = 40.0, fah = 120.0; cel > 30.0 && fah > 20.0; cel--, fah -= 10.0) {

            System.out.printf("%4.1f         %-5.1f           |       %-5.1f           %-5.2f\n",cel,celciusToFahrenheit(cel),fah,fahrenheitToCelsius(fah));
        }
    }

    public static double celciusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;

        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        return celsius;
    }


}
