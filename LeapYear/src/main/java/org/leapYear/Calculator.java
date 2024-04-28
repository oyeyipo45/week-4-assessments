package org.leapYear;

public class Calculator {
    public boolean isLeapYear(int year) {
        boolean isLeapYear =  (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
            return true;
        } else {
            System.out.println(year + " is not a leap year.");
            return false;
        }
    }
}
