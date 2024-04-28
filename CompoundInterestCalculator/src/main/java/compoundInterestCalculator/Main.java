package compoundInterestCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        UserInput userInput = new UserInput();

        // Get user input
        double principal = userInput.getUserInput(scanner, "Please enter the principal amount (e.g. 1000): ");
        double interestRate = userInput.getUserInput(scanner, "Please enter the annual interest rate (e.g. 5 for 5%): ") / 100.0;
        int timeUnit = userInput.getUserInputInt(scanner);
        double time = userInput.getUserInput(scanner, "Please enter the time period (based on your choice): ");

        // Calculate interest duration
        time = calculator.convertTimeToYears(timeUnit, time);

        // Calculate interest
        double amount = calculator.calculateCompoundInterest(principal, interestRate, time);

        System.out.println("\nUser Input and Compound interest below:");
        System.out.printf("Principal: %.2f\n", principal);
        System.out.printf("Interest rate: %.2f%%\n", interestRate * 100);
        System.out.printf("Time: %.2f years\n", time);
        System.out.printf("Amount after compound interest: %.2f\n", amount);
    }
}