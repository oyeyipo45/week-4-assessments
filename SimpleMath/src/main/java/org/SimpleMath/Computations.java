package org.SimpleMath;

import java.util.Scanner;

public class Computations {

    private static void solutionHeader(int option){
        System.out.printf("\nSolution to Option %d is below: ", option);
    }
     void sumTwoNumbers(Scanner scanner) {
        System.out.print("Please enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        solutionHeader(1);
        System.out.println("\nSum: " + sum);
    }

    void roundUserInput(Scanner scanner) {
        System.out.print("Please enter a number: ");
        double number = scanner.nextDouble();

        double roundedNumber = Math.round(number * 100.0) / 100.0;

        solutionHeader(2);
        System.out.println("\nConverted value (rounded to 2 decimals): " + roundedNumber);
    }

    void calculateStatistics(Scanner scanner) {
        double[] values = new double[5];
        double sum = 0;

        // Collect needed values
        for (int i = 0; i < values.length; i++) {
            System.out.print("Please enter value " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();
            sum += values[i];
        }

        // Average
        double average = sum / values.length;
        double min = values[0];
        double max = values[0];

        // Compute min and max values
        for (double value : values) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        // Square root of max value
        double maxValueSquareRoot = Math.sqrt(max);

        // Output solution
        solutionHeader(3);
        System.out.println("\nThe sum: " + sum);
        System.out.println("The average: " + average);
        System.out.println("The minimum value: " + min);
        System.out.println("The maximum value: " + max);
        System.out.println("The square root of maximum value: " + maxValueSquareRoot);
    }
}
