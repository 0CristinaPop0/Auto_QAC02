package homework;

import java.util.Scanner;
public class ArithmeticCalculator {
    public static double calculate(double n, String op, double m) {//double returns numbers with decimals

        switch (op){
            case "+": {
                return n + m;
            }
            case "-": {
                return n - m;
            }
            case "*": {
                return n * m;
            }
            case "/": {
                if (m!=0)
                return n / m;

             else{
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN; // Return 'Not a Number' if division by zero occurs
                }
            }
            default:
                System.out.println("Error: Invalid operation.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner myCalculator = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the first number: ");
        double n = myCalculator.nextDouble(); //first number
        System.out.println("Enter the operator +, -, *, /");
        String operator = myCalculator.next(); //operator
        System.out.println("Enter the second number: ");
        double m = myCalculator.nextDouble();//second number

        double r = calculate(n,operator,m);//result
        if (!Double.isNaN(r)) {
            System.out.println("Result: " + r);
        }



    }
}