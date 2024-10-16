package task;
import java.util.Scanner;

public class Temp {

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    // Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature value
        System.out.print("Enter the temperature value: ");
        double value = scanner.nextDouble();

        // Input the unit of temperature
        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        String unit = scanner.next().toUpperCase();

        switch (unit) {
            case "C":
                System.out.println(value + "°C is " + celsiusToFahrenheit(value) + "°F and " + celsiusToKelvin(value) + "K");
                break;

            case "F":
                System.out.println(value + "°F is " + fahrenheitToCelsius(value) + "°C and " + fahrenheitToKelvin(value) + "K");
                break;

            case "K":
                System.out.println(value + "K is " + kelvinToCelsius(value) + "°C and " + kelvinToFahrenheit(value) + "°F");
                break;

            default:
                System.out.println("Invalid unit entered.");
                break;
        }

        scanner.close();
    }
}
