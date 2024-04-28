package currencyConverter;

public class Main {

    static CurrencyConverter converter = new CurrencyConverter();

    public static void main(String[] args) {
        CurrencyConverter.populateExchangeRates();
        CurrencyConverter.displayMenu();
    }
}