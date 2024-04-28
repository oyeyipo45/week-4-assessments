package org.assessment;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public String formatDateInput(String dateString) {

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", DateTimeFormatter.ISO_LOCAL_DATE.getLocale());
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");

        try {
            LocalDate date = LocalDate.parse(dateString, inputFormatter);
            return date.format(outputFormatter);
        } catch (Exception e) {
            return null;
        }
    }
}
