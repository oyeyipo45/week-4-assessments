package compoundInterestCalculator;

import java.util.Scanner;


public class UserInput {
     double getUserInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

     int getUserInputInt(Scanner scanner, String message, int min, int max) {
        int choice;
        do {
            System.out.print(message);
            choice = scanner.nextInt();
        } while (choice < min || choice > max);
        return choice;
    }
}
