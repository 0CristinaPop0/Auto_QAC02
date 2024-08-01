package homework;

import java.util.Scanner;
public class FebruaryDays {
    // Macro to check if a year
    // is a leap year
    static int ISLP(int y) {
        if ((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a year between 1900 and 2016");
        int Year = Integer.parseInt(year.nextLine());  // Read user input
        if (ISLP(Year)==1 && (Year >=1900 && Year <=2016))
            System.out.println("The year " + Year + " has 29 days for the month of February");  // Output user input
        else if (ISLP(Year)==0 && (Year >=1900 && Year <=2016))
            System.out.println("The year " + Year + " has 28 days for the month of February");  // Output user input
        else System.out.println("Value out of bounds");
    }
}

