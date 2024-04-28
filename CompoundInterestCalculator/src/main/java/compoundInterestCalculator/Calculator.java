package compoundInterestCalculator;

public class Calculator {

    // Convert user input
    public double convertTimeToYears(int timeUnit, double time) {
        switch (timeUnit) {
            case 1 -> { // Years
                return time;
            }
            case 2 -> { // Months
                return time / 12.0;
            }
            case 3 -> { // Days
                return time / 365.0;
            }
            default -> {
                System.out.println("Invalid time unit. Considering time in years by default.");
                return time;
            }
        }
    }

    // Calculate interest
    public double calculateCompoundInterest(double principal, double interestRate, double time) {
        int compoundingPeriods = 1;
        return principal * Math.pow(1 + interestRate / compoundingPeriods, compoundingPeriods * time);
    }
}
