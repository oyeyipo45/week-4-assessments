package org.leapYear;

import java.util.Scanner;

public class UserInput {
    int getUserInputYear(Scanner scanner) {
        System.out.print("Please enter a year: ");
        return scanner.nextInt();
    }
}