package org.leapYear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        UserInput userInput = new UserInput();

       int year = userInput.getUserInputYear(scanner);

        calculator.isLeapYear(year);

        scanner.close();
    }
}