package compoundInterestCalculator;

import java.util.Scanner;


public class UserInput {
    // Get user input of type string
     double getUserInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    // Get user input of type int
     int getUserInputInt(Scanner scanner) {
        int choice;
        do {
            System.out.print("Please enter your choice (1-3 for Years, Months, Days): ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 3);
        return choice;
    }
}
