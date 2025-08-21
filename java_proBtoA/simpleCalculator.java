package java_proBtoA;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Choose operation (+, -, *, /):");
            char operator = scanner.next().charAt(0);

            double result = 0.0;
            boolean valid = true;

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
                        System.out.println("Error: Cannot divide by zero!");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    valid = false;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }

            System.out.println("Do you want to continue? (Y/N)");
            choice = scanner.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Calculator closed.");
        scanner.close();
    }
}
