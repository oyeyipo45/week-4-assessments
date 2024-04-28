package org.assessment;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DateFormatter formattedDate = new DateFormatter();

            System.out.print("Please enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Please enter your date of birth in this exact format :  (YYYY-MM-DD): ");
            String dateOrBirth = scanner.nextLine();
            LocalDate birthDate = LocalDate.parse(dateOrBirth);

            LocalDate today = LocalDate.now();
            Period age = Period.between(birthDate, today);
            int yearsOld = age.getYears();

            String dateFormatted = formattedDate.formatDateInput(today.toString());

            System.out.printf("Welcome %s, you are %d years old and today's date is %s\n",
                     name, yearsOld, dateFormatted);

            scanner.close();
    }
}