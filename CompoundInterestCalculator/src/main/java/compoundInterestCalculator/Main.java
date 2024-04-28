package compoundInterestCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        UserInput userInput = new UserInput();

        double principal, interestRate, time;
        int timeUnit;

        System.out.print("Please enter the principal amount (e.g., 1000): ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 5 for 5%): ");
        interestRate = scanner.nextDouble();
        interestRate /= 100.0;

        System.out.println("Enter the time period:");
        System.out.println("1. Years");
        System.out.println("2. Months");
        System.out.println("3. Days");
        System.out.print("Enter your choice (1-3): ");
        timeUnit = scanner.nextInt();

        System.out.print("Enter the time period (based on your choice): ");
        time = scanner.nextDouble();

        time = calculator.convertTimeToYears(timeUnit, time);

        double amount = calculator.calculateCompoundInterest(principal, interestRate, time);

        System.out.printf("Principal: %.2f\n", principal);
        System.out.printf("Interest rate: %.2f%%\n", interestRate * 100);
        System.out.printf("Time: %.2f years\n", time);
        System.out.printf("Amount after compound interest: %.2f\n", amount);
    }
}