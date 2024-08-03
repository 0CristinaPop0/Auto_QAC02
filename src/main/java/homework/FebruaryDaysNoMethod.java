package homework;

import java.util.Scanner;

public class FebruaryDaysNoMethod {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a year between 1900 and 2016");
        int Year = Integer.parseInt(year.nextLine());  // Read user input

        // Check if the year is a leap year
        boolean isLeapYear = (Year % 400 == 0) || (Year % 100 != 0 && Year % 4 == 0);

        // Ensure the year is within the specified range
        if (Year >= 1900 && Year <= 2016) {
            if (isLeapYear) {
                System.out.println("The year " + Year + " has 29 days for the month of February");
            } else {
                System.out.println("The year " + Year + " has 28 days for the month of February");
            }
        } else {
            System.out.println("Value out of bounds");
        }
    }
}
