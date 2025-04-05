package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'kg' to convert kilograms to pounds or 'lb' to convert pounds to kilograms:");
        String choice = scanner.nextLine();

        System.out.print("Enter value: ");
        double value = scanner.nextDouble();

        if (choice.equalsIgnoreCase("kg")) {
            System.out.println("Result: " + Math.round(kgToLb(value) * 100.0) / 100.0 + " lb");
        } else if (choice.equalsIgnoreCase("lb")) {
            System.out.println("Result: " + Math.round(lbToKg(value) * 100.0) / 100.0 + " kg");
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static double kgToLb(double kg) {
        return kg * 2.20462;
    }

    public static double lbToKg(double lb) {
        return lb * 0.453592;
    }
}
