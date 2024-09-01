package project;

import java.util.Scanner;

public class DynamicCalculator {

	public static double calculate(double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;  // Return NaN to indicate error
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return Double.NaN;  // Return NaN to indicate error
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the result
        double result = calculate(num1, num2, operator);

        // Display the result if no error occurred
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}