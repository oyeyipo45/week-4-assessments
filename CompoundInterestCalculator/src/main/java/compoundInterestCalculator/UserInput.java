package compoundInterestCalculator;

import java.util.Scanner;


public class UserInput {
     double getUserInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

     int getUserInputInt(Scanner scanner) {
        int choice;
        do {
            System.out.print("Please enter your choice (1-3 for Years, Months, Days): ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 3);
        return choice;
    }
}
