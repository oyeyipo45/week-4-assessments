package org.assessment;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
    public String formatDateInput(String dateString) {

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", DateTimeFormatter.ISO_LOCAL_DATE.getLocale());
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");

        System.out.println(inputFormatter);

        try {
            LocalDate date = LocalDate.parse(dateString, inputFormatter);
            return date.format(outputFormatter);
        } catch (DateTimeParseException e) {
            return "Invalid date format. Please use YYYY-MM-DD.";
        } catch (Exception e) {
            return null;
        }
    }
}
