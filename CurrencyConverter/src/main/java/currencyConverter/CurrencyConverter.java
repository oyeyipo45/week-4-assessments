package currencyConverter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {


    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static void populateExchangeRates() {
        exchangeRates.put("NGN", 1.0); // Base currency (Nigerian Naira)
        exchangeRates.put("USD", 0.00077);
        exchangeRates.put("EUR", 0.00072);
        exchangeRates.put("GBP", 0.00061);
        exchangeRates.put("CNY", 0.0054);
    }

    static void displayMenu() {
        int choice;
        do {
            System.out.println("\nDami Currency Converter");
            System.out.println("1. Convert Currency");
            System.out.println("2. Display Supported Currencies");
            System.out.println("3. Exit");
            System.out.print("\nPlease enter your choice: ");

            choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1 -> convertCurrency();
                    case 2 -> displaySupportedCurrencies();
                    case 3 -> System.out.println("\nExiting Currency Converter...");
                    default -> System.out.println("\nInvalid selection: Please select an option between 1 - 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Please enter a number.");
                scanner.nextLine();
            }
        } while (choice != 3);
    }

    static void convertCurrency() {
        System.out.print("Please enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Please enter the currency you have in the provided exact ISO3 code format (e.g. NGN, USD, EUR, GBP, CNY): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Please enter the currency you want to convert to in the exact ISO3 code format (e.g. NGN, USD, EUR, GBP, CNY): ");
        String toCurrency = scanner.next().toUpperCase();

        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            System.out.println("\nUnsupported currency. Please select from available options.");
            return;
        }

        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);
        double convertedAmount = (amount * toRate) / fromRate;

        System.out.printf("\n%.2f %s is equivalent to %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
    }

    static void displaySupportedCurrencies() {
        System.out.println("\nSupported Currencies:");
        for (String currency : exchangeRates.keySet()) {
            System.out.println(currency);
        }
    }
}
