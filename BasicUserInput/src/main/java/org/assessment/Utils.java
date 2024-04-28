package org.assessment;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Utils {
    Scanner scanner = new Scanner(System.in);
    public String getUserInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public LocalDate getBirthDate(Scanner scanner, String message) {
        System.out.print(message);
        String dateString = scanner.nextLine();
        return LocalDate.parse(dateString);
    }

    public int calculateAge(LocalDate birthDate, LocalDate today) {
        Period age = Period.between(birthDate, today);
        return age.getYears();
    }
}
