package SwitchStatements;

import java.util.Scanner; // imports Scanner tool from Library

public class Main {

    public static void main(String[] args) {
        //Prints command options for user
        System.out.println("Hi, this program can make conversions.\n"
                + "\tTo convert:\n"
                + "\tFahrenheit to Celsius enter 'F2C'\n"
                + "\tCelsius to Fahrenheit enter 'C2F'\n"
                + "\tPound(s) to Kilogram(s) enter 'P2K'\n"
                + "\tKilogram(s) to Pounds(s) enter 'K2P'\n"
                + "\tDollar(s) to Euro(s) enter 'E2U'\n"
                + "\tEuro(s) to Dollar(s) enter 'E2U'\n"
                + "\tYou can enter 'Q' to exit program.\n");
        Scanner input = new Scanner(System.in); // Collects user input
        String cmd = "";

        while (!cmd.equalsIgnoreCase("q")) {
            System.out.print("Command: ");
            cmd = input.next().toUpperCase();  // Accesses user input as a string

            switch (cmd) {

                case "F2C": {
                    System.out.print("Please enter a value in Fahrenheit: ");
                    float tempF = input.nextFloat();  // Get Fahrenheit input as a float
                    float tempC = (tempF - 32) * 5 / 9; // F2C conversion
                    System.out.printf("Fahrenheit: %.2f° is equivalent to Celsius: %.2f°\n", tempF, tempC);
                    break;
                }

                case "C2F": {
                    System.out.print("Please enter a value in Celsius: ");
                    float tempC = input.nextFloat();  // Get Celsius input as a float
                    float tempF = ((tempC * 9 / 5) + 32); //C2F conversion
                    System.out.printf("Celsius: %.2f° is equivalent to Fahrenheit: %.2f°\n", tempC, tempF);
                    break;
                }

                case "P2K": {
                    System.out.print("Please enter a value in Pound(s): ");
                    float lb = input.nextFloat(); // Get lbs input as a float
                    float kg = lb * (float) 0.45359237; // P2K conversion
                    System.out.printf("Pound(s): %.1f is equivalent to Kilogram(s): %.1f\n", lb, kg);
                    break;
                }

                case "K2P":
                    System.out.print("Please enter a value in Kilograms(s): ");
                    float kg = input.nextFloat(); // Get lbs input as a float
                    float lb = kg * (float) 2.20462; // P2K conversion
                    System.out.printf("Kilogram(s): %.1f is equivalent to Pound(s): %.1f\n", kg, lb);
                    break;

                case "U2E": {
                    System.out.print("Please enter a value in Dollars(s): ");
                    double dollar = input.nextDouble(); // Get dollar input as a double
                    double euro = dollar * 0.925058; // U2E conversion APPROXIMATION FOR 01/12/23
                    System.out.printf("US Dollar(s): $%.2f is equivalent to Euro(s): €%.2f\n", dollar, euro);
                    break;
                }

                case "E2U": {
                    System.out.print("Please enter a value in US Euros(s): ");
                    double euro = input.nextDouble(); // Get euro input as a double
                    double dollar = euro * 1.0810133; // E2U conversion APPROXIMATION FOR 01/12/23
                    System.out.printf("Euro(s): €%.2f is equivalent to US Dollar(s): $%.2f\n", euro, dollar);
                    break;
                }

                case "Q":
                    System.out.println("You have exited the program");
                    break; // terminates program

                default:  // Instructs user to enter a valid command for any entry other than listed commands
                    System.out.println("Invalid entry. Please try again.");
            }
        }

        input.close(); // close scanner
    }
}