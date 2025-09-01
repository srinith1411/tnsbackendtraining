package tnsjavaExceptionHandling;

public class BasicTryCatch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; // risky line
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
