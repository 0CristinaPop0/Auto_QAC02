package homework;

import java.util.Scanner;

public class ArithmeticCalculatorNoMethod {
    public static void main(String[] args) {
        Scanner myCalculator = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter the first number: ");
        double n = myCalculator.nextDouble(); // First number

        System.out.println("Enter the operator +, -, *, /");
        String operator = myCalculator.next(); // Operator

        System.out.println("Enter the second number: ");
        double m = myCalculator.nextDouble(); // Second number

        double result = 0; // Variable to store the result
        boolean validOperation = true;

        // Perform the calculation based on the operator
        switch (operator) {
            case "+":
                result = n + m;
                break;
            case "-":
                result = n - m;
                break;
            case "*":
                result = n * m;
                break;
            case "/":
                if (m != 0) {
                    result = n / m;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                validOperation = false;
                break;
        }

        // Output the result if the operation was valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }
    }
}
