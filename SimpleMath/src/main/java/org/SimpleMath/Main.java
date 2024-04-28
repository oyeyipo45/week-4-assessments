package org.SimpleMath;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computations Calculate = new Computations();

        int choice;

        // When user selects between options 1 - 4 run the loop
        do {
            System.out.println("\nOptions: Please select program of choice");
            System.out.println("1. Sum of 2 whole numbers (strings are not allowed)");
            System.out.println("2. Convert user input (rounded to 2 decimals)");
            System.out.println("3. Statistics data on 5 user inputs");
            System.out.println("4. Exit");
            System.out.print("\nPlease select your choice: ");

            choice = scanner.nextInt();

            try {
                // Use as switch to handle different cases
                switch (choice) {
                    case 1 -> Calculate.sumTwoNumbers(scanner);
                    case 2 -> Calculate.roundUserInput(scanner);
                    case 3 -> Calculate.calculateStatistics(scanner);
                    case 4 -> System.out.println("\nThank you: Exiting calculator...");
                    default -> System.out.printf("\nInvalid selection: No %d. \nPlease select a valid option between 1 - 4.\n", choice);
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Please enter a number.");
                scanner.nextLine();
            }
        } while (choice != 4);

        scanner.close();
    }
}