
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in) // Ensure the scanner is closed
                ) {
            System.out.println("Enter the first number, operator (+, -, *, /), and second number:");

            float firstNumber = scanner.nextFloat();
            // Use next() to read the operator
            String operator = scanner.next();
            float secondNumber = scanner.nextFloat();

            float result;

            switch (operator) {
                case "+" -> {
                    result = firstNumber + secondNumber;
                    System.out.println("Result: " + result);
                }
                case "-" -> {
                    result = firstNumber - secondNumber;
                    System.out.println("Result: " + result);
                }
                case "*" -> {
                    result = firstNumber * secondNumber;
                    System.out.println("Result: " + result);
                }
                case "/" -> {
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                default ->
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Print the error message
        }
    }
}
