package org.assessment;
import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DateFormatter formattedDate = new DateFormatter();
            Utils utils = new Utils();

            // Get name of user
            String name = utils.getUserInput(scanner, "\nPlease enter your name: ");

            // Get user birthday
            LocalDate birthDate = utils.getBirthDate(scanner, "\nPlease enter your date of birth in YYYY-MM-DD format: ");

            // Date today
            LocalDate today = LocalDate.now();

            // Calculate entered age
            int yearsOld = utils.calculateAge(birthDate, today);

            // Format the date
            String dateFormatted = formattedDate.formatDateInput(today.toString());

            // Output result
            System.out.printf("\nWelcome %s, you are %d years old and today's date is %s\n",
                     name, yearsOld, dateFormatted);

            scanner.close();
    }
}