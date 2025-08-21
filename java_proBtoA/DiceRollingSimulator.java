package java_proBtoA;

import java.util.Random;
import java.util.Scanner;

public class DiceRollingSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String choice;

        System.out.println("Welcome to Dice Rolling Simulator!");

        do {
            int dice = random.nextInt(6) + 1; // 1 to 6
            System.out.println("You rolled: " + dice);

            System.out.print("Roll again? (yes/no): ");
            choice = scanner.next().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}

